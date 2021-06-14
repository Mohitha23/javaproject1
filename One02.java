package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.AnnotatedType;

public class One02 {
	throws NoSuchFieldException, NoSuchMethodException {

	    Annotation anno;
	    AnnotatedType at;

	    at = c.getDeclaredField("typeAnnotatedArray").getAnnotatedType();
	    anno = at.getAnnotations()[0];
	    Object[] arrayTA;
		verifyTestAnn(arrayTA[0], anno, "array1");
	    arrayTA[0] = anno;

	    for (int i = 1; i <= 3; i++) {
	        at = ((AnnotatedArrayType) at).getAnnotatedGenericComponentType();
	        anno = at.getAnnotations()[0];
	        verifyTestAnn(arrayTA[i], anno, "array" + (i + 1));
	        arrayTA[i] = anno;
	    }

}

	private void verifyTestAnn(Object object, Annotation anno, String string) {
		// TODO Auto-generated method stub
		
	}
