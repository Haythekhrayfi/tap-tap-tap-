package com.yandex.metrica.rtm.wrapper;

import com.yandex.metrica.rtm.client.DataSender;
import com.yandex.metrica.rtm.client.ReporterDescriptor;

/* JADX INFO: loaded from: classes.dex */
public class d implements ea.a {
    public d(ea.f fVar, String str, boolean z10) throws Throwable {
        new b(new DataSender(new g(fVar), new ReporterDescriptor(str, z10)));
    }
}
