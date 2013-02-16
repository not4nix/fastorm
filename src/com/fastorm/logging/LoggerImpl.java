package com.fastorm.logging;

import javax.inject.Inject;
import java.io.File;

public class LoggerImpl implements ILogger{

    @Inject
    private ILogger mLogger;

    public LoggerImpl(){}

    public LoggerImpl(ILogger logger){
        mLogger = logger;
    }

    private final Logger logger = new Logger(mLogger);


    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isVerboseEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public boolean isExceptionEnabled() {
        return false;
    }

    @Override
    public boolean isRuntimeExceptionEnabled() {
        return false;
    }

    @Override
    public boolean isFatalErrorEnabled() {
        return false;
    }

    @Override
    public void trace(String message) {
    }

    @Override
    public void trace(String message, Throwable throwable) {
    }

    @Override
    public void trace(File file, String message, Throwable throwable) {
        logger.writeTraceLog(file,message,throwable);
    }

    @Override
    public void debug(String message) {
    }

    @Override
    public void debug(String message, Throwable throwable) {
    }

    @Override
    public void debug(File file, String message, Throwable throwable) {
        logger.writeDebugLog(file,message,throwable);
    }

    @Override
    public void warn(String message) {
    }

    @Override
    public void warn(String message, Throwable throwable) {
    }

    @Override
    public void warn(File file, String message, Throwable throwable) {
        logger.writeWarnLog(file,message,throwable);
    }

    @Override
    public void info(String message) {
    }

    @Override
    public void info(String message, Throwable throwable) {
    }

    @Override
    public void info(File file, String message, Throwable throwable) {
        logger.writeInfoLog(file,message,throwable);
    }

    @Override
    public void verbose(String message) {
    }

    @Override
    public void verbose(String message, Throwable throwable) {
    }

    @Override
    public void verbose(File file, String message, Throwable throwable) {
        logger.writeVerboseLog(file,message,throwable);
    }

    @Override
    public void error(String message) {
    }

    @Override
    public void error(String message, Throwable throwable) {
    }

    @Override
    public void error(File file, String message, Throwable throwable) {
        logger.writeErrorLog(file,message,throwable);
    }

    @Override
    public void exception(String message) {
    }

    @Override
    public void exception(String message, Throwable throwable) {
    }

    @Override
    public void exception(File file, String message, Throwable throwable) {
        logger.writeExceptionLog(file,message,throwable);
    }

    @Override
    public void printRuntimeException(String message) {
    }

    @Override
    public void printRuntimeException(String message, Throwable throwable) {
    }

    @Override
    public void printRuntimeException(File file, String message, Throwable throwable) {
        logger.writeRuntimeException(file,message,throwable);
    }

    @Override
    public void printFatalError(String message) {
    }

    @Override
    public void printFatalError(String message, Throwable throwable) {
    }

    @Override
    public void printFatalError(File file, String message, Throwable throwable) {
        logger.writeFatalErrorLog(file,message,throwable);
    }
}
