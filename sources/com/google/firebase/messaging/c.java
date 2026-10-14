package com.google.firebase.messaging;

import d6.t;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements q5.e<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12631a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q5.d f12632b = q5.d.a("messagingClientEventExtension");

    @Override // q5.b
    public void encode(Object obj, q5.f fVar) throws IOException {
        fVar.a(f12632b, ((t) obj).a());
    }
}
