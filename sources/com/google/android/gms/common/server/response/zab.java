package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zab implements zai<Long> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Long zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Long.valueOf(fastParser.zan(bufferedReader));
    }
}
