package com.google.firebase.messaging;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements q5.e<e6.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12629a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q5.d f12630b;

    static {
        t5.a aVar = new t5.a();
        aVar.f35679a = 1;
        t5.d dVarA = aVar.a();
        HashMap map = new HashMap();
        map.put(dVarA.annotationType(), dVarA);
        f12630b = new q5.d("messagingClientEvent", com.google.android.datatransport.runtime.a.a(map), null);
    }

    @Override // q5.b
    public void encode(Object obj, q5.f fVar) throws IOException {
        fVar.a(f12630b, ((e6.b) obj).f29055a);
    }
}
