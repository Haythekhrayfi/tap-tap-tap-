package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zad implements zai<Double> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Double zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Double.valueOf(fastParser.zaj(bufferedReader));
    }
}
