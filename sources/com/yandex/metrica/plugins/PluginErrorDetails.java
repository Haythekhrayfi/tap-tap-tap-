package com.yandex.metrica.plugins;

import com.yandex.metrica.impl.ob.U2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PluginErrorDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<StackTraceItem> f18094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f18097f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<StackTraceItem> f18100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map<String, String> f18103f;

        public PluginErrorDetails build() {
            String str = this.f18098a;
            String str2 = this.f18099b;
            List<StackTraceItem> list = this.f18100c;
            List<StackTraceItem> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f18101d;
            String str4 = this.f18102e;
            Map<String, String> map = this.f18103f;
            Map<String, String> map2 = new HashMap<>();
            if (map != null) {
                map2 = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, map2, null);
        }

        public Builder withExceptionClass(String str) {
            this.f18098a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f18099b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f18101d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f18103f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f18100c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f18102e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, a aVar) {
        this.f18092a = str;
        this.f18093b = str2;
        this.f18094c = new ArrayList(list);
        this.f18095d = str3;
        this.f18096e = str4;
        this.f18097f = U2.a(U2.a(map));
    }

    public String getExceptionClass() {
        return this.f18092a;
    }

    public String getMessage() {
        return this.f18093b;
    }

    public String getPlatform() {
        return this.f18095d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f18097f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f18094c;
    }

    public String getVirtualMachineVersion() {
        return this.f18096e;
    }
}
