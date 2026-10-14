package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class zag implements zai<BigInteger> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ BigInteger zaa(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return fastParser.zat(bufferedReader);
    }
}
