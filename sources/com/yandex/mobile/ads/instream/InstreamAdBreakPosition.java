package com.yandex.mobile.ads.instream;

/* JADX INFO: loaded from: classes3.dex */
public class InstreamAdBreakPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f27461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f27462b;

    public enum Type {
        PERCENTS,
        MILLISECONDS,
        POSITION;

        Type() {
        }
    }

    public InstreamAdBreakPosition(Type type, long j10) {
        this.f27462b = j10;
        this.f27461a = type;
    }

    public Type getPositionType() {
        return this.f27461a;
    }

    public long getValue() {
        return this.f27462b;
    }
}
