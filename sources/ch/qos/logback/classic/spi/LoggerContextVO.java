package ch.qos.logback.classic.spi;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.CoreConstants;
import defpackage.a;
import java.io.Serializable;
import java.util.Map;
import l1.c;

/* JADX INFO: loaded from: classes.dex */
public class LoggerContextVO implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;
    public final long birthTime;
    public final String name;
    public final Map<String, String> propertyMap;

    public LoggerContextVO(LoggerContext loggerContext) {
        this.name = loggerContext.getName();
        this.propertyMap = loggerContext.getCopyOfPropertyMap();
        this.birthTime = loggerContext.getBirthTime();
    }

    public LoggerContextVO(String str, Map<String, String> map, long j10) {
        this.name = str;
        this.propertyMap = map;
        this.birthTime = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoggerContextVO)) {
            return false;
        }
        LoggerContextVO loggerContextVO = (LoggerContextVO) obj;
        if (this.birthTime != loggerContextVO.birthTime) {
            return false;
        }
        String str = this.name;
        if (str == null ? loggerContextVO.name != null : !str.equals(loggerContextVO.name)) {
            return false;
        }
        Map<String, String> map = this.propertyMap;
        Map<String, String> map2 = loggerContextVO.propertyMap;
        return map == null ? map2 == null : map.equals(map2);
    }

    public long getBirthTime() {
        return this.birthTime;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getPropertyMap() {
        return this.propertyMap;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.propertyMap;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.birthTime;
        return iHashCode2 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder sbA = a.a("LoggerContextVO{name='");
        c.a(sbA, this.name, CoreConstants.SINGLE_QUOTE_CHAR, ", propertyMap=");
        sbA.append(this.propertyMap);
        sbA.append(", birthTime=");
        return o2.a.a(sbA, this.birthTime, '}');
    }
}
