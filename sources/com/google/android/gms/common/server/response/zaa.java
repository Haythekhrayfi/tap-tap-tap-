package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zaa implements zai<Integer> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Integer zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Integer.valueOf(fastParser.zal(bufferedReader));
    }
}
