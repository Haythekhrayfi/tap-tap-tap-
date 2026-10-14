package com.yandex.metrica;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f extends ReporterConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f13560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f13561c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ReporterConfig.Builder f13562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f13563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f13564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinkedHashMap<String, String> f13565d = new LinkedHashMap<>();

        public a(String str) {
            this.f13562a = ReporterConfig.newConfigBuilder(str);
        }
    }

    public f(ReporterConfig reporterConfig) {
        Map<String, String> map;
        super(reporterConfig);
        if (reporterConfig instanceof f) {
            f fVar = (f) reporterConfig;
            this.f13559a = fVar.f13559a;
            this.f13560b = fVar.f13560b;
            map = fVar.f13561c;
        } else {
            map = null;
            this.f13559a = null;
            this.f13560b = null;
        }
        this.f13561c = map;
    }

    public f(a aVar) {
        super(aVar.f13562a);
        this.f13560b = aVar.f13563b;
        this.f13559a = aVar.f13564c;
        LinkedHashMap<String, String> linkedHashMap = aVar.f13565d;
        this.f13561c = linkedHashMap == null ? null : Collections.unmodifiableMap(linkedHashMap);
    }
}
