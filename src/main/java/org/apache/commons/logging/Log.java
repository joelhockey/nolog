/*
 * Apache Licence.
 */
package org.apache.commons.logging;
interface Log {
    void debug(Object o);;
    void error(Object o);
    void error(Object o, Throwable t);
    void fatal(Object o);
    void fatal(Object o, Throwable t);
    void info(Object o);
    void info(Object o, Throwable t);
    boolean isDebugEnabled();
    boolean isErrorEnabled();
    boolean isFatalEnabled();
    boolean isInfoEnabled();
    boolean isTraceEnabled();
    boolean isWarnEnabled();
    void trace(Object o);
    void trace(Object o, Throwable t);
    void warn(Object o);
    void warn(Object o, Throwable t);
}
