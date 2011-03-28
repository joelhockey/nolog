/*
 * Apache Licence.
 */

package org.apache.commons.logging;

public class LogFactory {
    public static final Log l = new NoLog();
    public static Log getLog(Class c) { return l; }
    public static Log getLog(String s) { return l; }
}
