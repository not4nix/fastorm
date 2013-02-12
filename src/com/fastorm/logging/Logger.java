package com.fastorm.logging;

public interface Logger {

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
     * Write trace log
     * @param message log message
     */
    public void trace(String message);

    /**
     * Write trace log
     * @param message log message
     * @param throwable throwable
     */
    public void trace(String message, Throwable throwable);

    /**
     * Write debug log level
     * @param message log message
     */
    public void debug(String message);

    /**
     * Write debug log level
     * @param message log message
     * @param throwable throwable
     */
    public void debug(String message, Throwable throwable);

    /**
     * Write warn log level
     * @param message log message
     */
    public void warn(String message);

    /**
     * Write warn log level
     * @param message log message
     * @param throwable throwable
     */
    public void warn(String message, Throwable throwable);

    /**
     * Write info log level
     * @param message log message
     */
    public void info(String message);

    /**
     * Write info log level
     * @param message log message
     * @param throwable throwable
     */
    public void info(String message, Throwable throwable);

    /**
     * Write verbose log level
     * @param message log message
     */
    public void verbose(String message);

    /**
     * Write verbose log level
     * @param message log message
     * @param throwable throwable
     */
    public void verbose(String message, Throwable throwable);

    /**
     * Write error log level
     * @param message log message
     */
    public void error(String message);

    /**
     * Write error log level
     * @param message log message
     * @param throwable throwable
     */
    public void error(String message, Throwable throwable);

    /**
     * Write exception log level
     * @param message log message
     */
    public void exception(String message);

    /**
     * Write exception log level
     * @param message log message
     * @param throwable throwable
     */
    public void exception(String message, Throwable throwable);

    /**
     * Write runtime exception log level
     * @param message log message
     */
    public void printRuntimeException(String message);

    /**
     * Write runtime exception log level
     * @param message log message
     * @param throwable throwable
     */
    public void printRuntimeException(String message, Throwable throwable);

    /**
     * Write fatal error log level
     * @param message log message
     */
    public void printFatalError(String message);

    /**
     * Write fatal error log level
     * @param message log message
     * @param throwable throwable
     */
    public void printFatalError(String message, Throwable throwable);
}
