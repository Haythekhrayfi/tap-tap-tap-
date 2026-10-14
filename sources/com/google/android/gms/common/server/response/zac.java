package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zac implements zai<Float> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Float zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Float.valueOf(fastParser.zak(bufferedReader));
    }
}
