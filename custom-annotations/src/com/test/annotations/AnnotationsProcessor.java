package com.test.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import com.test.TesterClass;

public class AnnotationsProcessor {
	
	public void processAnnotation() {
		Class<TesterClass> testerClass = TesterClass.class;

		for (Method method : testerClass.getDeclaredMethods()) {
			if (method.isAnnotationPresent(PCI.class)) {
				Annotation annotation = method.getAnnotation(PCI.class);
				PCI pci = (PCI) annotation;

				if (pci.enabled()) {
					try {
						method.invoke(testerClass.newInstance());
					} catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		}

	}
}