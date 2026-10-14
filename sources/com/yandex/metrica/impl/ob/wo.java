package com.yandex.metrica.impl.ob;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class wo implements uo<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, ?> f17812a;

    public wo(Map<String, ?> map) {
        this.f17812a = map;
    }

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(String str) {
        String str2 = str;
        return this.f17812a.containsKey(str2) ? so.a(this, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str2)) : so.a(this);
    }
}
