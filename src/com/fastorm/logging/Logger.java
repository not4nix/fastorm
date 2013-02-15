package com.fastorm.logging;

import android.util.Log;
import com.fastorm.logging.util.LoggingUtils;

import javax.inject.Inject;
import java.io.File;

public class Logger {
    private static final String TAG = "Logger.class";

    @Inject
    private StringBuilder mBuilder;
    @Inject
    private ILogger mLogger;

    public Logger(ILogger logger){
        mLogger = logger;
    }

    protected String buildArgumentString(){
        mBuilder = new StringBuilder();
        mBuilder.append("{").append("}");
        return mBuilder.toString();
    }

    protected int getArgumentStringLength(){
        return buildArgumentString().length();
    }

    public boolean isTrace(){
        return mLogger.isTraceEnabled();
    }

    public boolean isDebug(){
        return mLogger.isDebugEnabled();
    }

    public boolean isWarn(){
        return mLogger.isWarnEnabled();
    }

    public boolean isInfo(){
        return mLogger.isInfoEnabled();
    }

    public boolean isVerbose(){
        return mLogger.isVerboseEnabled();
    }

    public boolean isError(){
        return mLogger.isErrorEnabled();
    }

    public boolean isException(){
        return mLogger.isExceptionEnabled();
    }

    public boolean isRuntimeException(){
        return mLogger.isRuntimeExceptionEnabled();
    }

    public boolean isFatalError(){
        return mLogger.isFatalErrorEnabled();
    }

    public void writeTraceLog(File file, String message, Throwable throwable){
        if(isTrace() == true){
            LoggingUtils.writeLogFile(file,message,throwable);
        } else {
            Log.i(TAG, "trace false");
        }
    }

    public void writeDebugLog(File file, String message, Throwable throwable){
        if(isDebug() == true){
            LoggingUtils.writeLogFile(file,message,throwable);
        } else {
            Log.i(TAG, "debug false");
        }
    }

    public void writeWarnLog(File file, String message, Throwable throwable){
        if(isWarn() == true){
            LoggingUtils.writeLogFile(file, message, throwable);
        } else {
            Log.i(TAG, "warn false");
        }
    }

    public void writeInfoLog(File file, String message, Throwable throwable){
        if(isInfo() == true){
            LoggingUtils.writeLogFile(file,message,throwable);
        } else {
            Log.i(TAG, "info false");
        }
    }

    public void writeVerboseLog(File file, String message, Throwable throwable){
        if(isVerbose() == true){
            LoggingUtils.writeLogFile(file, message, throwable);
        } else {
            Log.i(TAG, "verbose false");
        }
    }

    public void writeErrorLog(File file, String message, Throwable throwable){
        if(isError() == true){
            LoggingUtils.writeLogFile(file, message, throwable);
        } else {
            Log.i(TAG, "error false");
        }
    }

    public void writeExceptionLog(File file, String message, Throwable throwable){
        if(isException() == true){
            LoggingUtils.writeLogFile(file, message, throwable);
        } else {
            Log.i(TAG, "exception false");
        }
    }

    public void writeRuntimeException(File file, String message, Throwable throwable){
        if(isRuntimeException() == true){
            LoggingUtils.writeLogFile(file, message, throwable);
        } else {
            Log.i(TAG, "runtime exception false");
        }
    }

    public void writeFatalErrorLog(File file, String message, Throwable throwable){
        if(isFatalError() == true){
            LoggingUtils.writeLogFile(file, message, throwable);
        } else {
            Log.i(TAG, "fatal error false");
        }
    }
}
