package com.fastorm.logging;

import java.io.File;

public interface ILogger {

    /**
     * Returns true if trace log level enabled
     * @return
     */
    public boolean isTraceEnabled();

    /**
     * Returns true if debug log level enabled
     * @return
     */
    public boolean isDebugEnabled();

    /**
     * Returns true if warn log level enabled
     * @return
     */
    public boolean isWarnEnabled();

    /**
     * Returns true if info log level enabled
     * @return
     */
    public boolean isInfoEnabled();

    /**
     * Returns true if verbose log level enabled
     * @return
     */
    public boolean isVerboseEnabled();

    /**
     * Returns true if error log level enabled
     * @return
     */
    public boolean isErrorEnabled();

    /**
     * Returns true if exception log level enabled
     * @return
     */
    public boolean isExceptionEnabled();

    /**
     * Returns true if runtime exception log level enabled
     * @return
     */
    public boolean isRuntimeExceptionEnabled();

    /**
     * Returns true if fatal error log level enabled
     * @return
     */
    public boolean isFatalErrorEnabled();

    /**
     * Write trace log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void trace(File file, String message, Throwable throwable);

    /**
     * Write debug log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void debug(File file, String message, Throwable throwable);


    /**
     * Write warn log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void warn(File file, String message, Throwable throwable);

    /**
     * Write info log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void info(File file, String message, Throwable throwable);

    /**
     * Write verbose log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void verbose(File file, String message, Throwable throwable);


    /**
     * Write error log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void error(File file, String message, Throwable throwable);

    /**
     * Write exception log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void exception(File file, String message, Throwable throwable);


    /**
     * Write runtime exception log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void printRuntimeException(File file, String message, Throwable throwable);


    /**
     * Write fatal error log into file which located into external storage
     * @param file file name
     * @param message log message
     * @param throwable throwable
     */
    public void printFatalError(File file, String message, Throwable throwable);
}
