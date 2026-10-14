package com.yandex.metrica;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f13585c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f13583a;
        if (str == null ? iVar.f13583a != null : !str.equals(iVar.f13583a)) {
            return false;
        }
        String str2 = this.f13584b;
        if (str2 == null ? iVar.f13584b != null : !str2.equals(iVar.f13584b)) {
            return false;
        }
        Map<String, String> map = this.f13585c;
        Map<String, String> map2 = iVar.f13585c;
        if (map != null) {
            return map.equals(map2);
        }
        return map2 == null;
    }

    public int hashCode() {
        String str = this.f13583a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f13584b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f13585c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
