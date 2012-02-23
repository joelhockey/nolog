/*
 * Apache Licence.
 */

package org.apache.commons.logging;

public class LogFactory {
    public static Log LOG = new NoLog();
    public static Log getLog(Class c) { return LOG; }
    public static Log getLog(String s) { return LOG; }
}
