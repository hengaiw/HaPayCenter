package com.hengaiw.pub.utils;


public abstract interface HaLogInf {

	public abstract void debug(String paramString, Object[] paramArrayOfObject);

	public abstract void info(String paramString, Object[] paramArrayOfObject);

	public abstract void warn(String paramString, Object[] paramArrayOfObject);

	public abstract void error(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject);
}
