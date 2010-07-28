/*
 * Apache Licence.
 */
package org.apache.commons.logging;
public class NoLog implements Log {
    public void debug(Object o) {}
    public void debug(Object o, Throwable t) {}
    public void error(Object o) {}
    public void error(Object o, Throwable t) {}
    public void fatal(Object o) {}
    public void fatal(Object o, Throwable t) {}
    public void info(Object o) {}
    public void info(Object o, Throwable t) {}
    public boolean isDebugEnabled() { return false; }
    public boolean isErrorEnabled() { return false; }
    public boolean isFatalEnabled() { return false; }
    public boolean isInfoEnabled() { return false; }
    public boolean isTraceEnabled() { return false; }
    public boolean isWarnEnabled() { return false; }
    public void trace(Object o) {}
    public void trace(Object o, Throwable t) {}
    public void warn(Object o) {}
    public void warn(Object o, Throwable t) {}
}
