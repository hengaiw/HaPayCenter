package com.hengaiw.pub.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HaLog extends HaLogFace {

	private static final Map<String, HaLog> _pool = new HashMap<String, HaLog>();

	// ----------
	public static synchronized Set<String> getLoggers() {
		return _pool.keySet();
	}

	public static synchronized void clearLoggers() {
		_pool.clear();
	}

	// ----------
	public static synchronized HaLog getLog(String clz) {
		HaLog log = _pool.get(clz);
		if (log == null) {
			log = new HaLog();
			log.setName(clz);
			_pool.put(clz, log);
		}
		return log;
	}

	// ----------
	public static HaLog getLog(Class<?> clz) {
		return getLog(clz.getName());
	}

}
