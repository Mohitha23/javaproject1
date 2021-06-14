package test;

import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;

public class One22 {
	{
	Object ex = null;
	try {
	    Object server = null;
		server.getClass().getMethod("start", new Class[0]).
	        invoke(server, new Object[0]);
	  } catch(InvocationTargetException ex1) {
	    Throwable cause = ex1.getTargetException();
	    if (cause instanceof RuntimeException) {
	      throw (RuntimeException) cause;
	    } else if (cause != null) {
	      if (cause instanceof InterruptedException
	          || cause instanceof InterruptedIOException) {
	        Thread.currentThread().interrupt();
	      }
	      throw new RuntimeException(cause.toString());
	    } else {
	      throw new RuntimeException();
	    }
	  } catch(NoSuchMethodException ex11) {
	    throw new RuntimeException(ex.toString());
	  } catch(IllegalAccessException ex1) {
	   throw new RuntimeException(ex.toString());
	 }

}
}

