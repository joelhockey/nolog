/*
 * Apache Licence.
 */
package org.apache.commons.logging;
public class SysOutLog implements Log {
    public void debug(Object o) { System.out.println(o); }
    public void debug(Object o, Throwable t) { System.out.println(o); t.printStackTrace(); }
    public void error(Object o) { System.out.println(o); }
    public void error(Object o, Throwable t) { System.out.println(o); t.printStackTrace(); }
    public void fatal(Object o) { System.out.println(o); }
    public void fatal(Object o, Throwable t) { System.out.println(o); t.printStackTrace(); }
    public void info(Object o) { System.out.println(o); }
    public void info(Object o, Throwable t) { System.out.println(o); t.printStackTrace(); }
    public boolean isDebugEnabled() { return true; }
    public boolean isErrorEnabled() { return true; }
    public boolean isFatalEnabled() { return true; }
    public boolean isInfoEnabled() { return true; }
    public boolean isTraceEnabled() { return true; }
    public boolean isWarnEnabled() { return true; }
    public void trace(Object o) { System.out.println(o); }
    public void trace(Object o, Throwable t) { System.out.println(o); t.printStackTrace(); }
    public void warn(Object o) { System.out.println(o); }
    public void warn(Object o, Throwable t) { System.out.println(o); t.printStackTrace(); }
}
