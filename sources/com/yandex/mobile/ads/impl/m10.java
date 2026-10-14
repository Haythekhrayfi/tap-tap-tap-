package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class m10 extends r11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f22870c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f22871a = qh.f24496c.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f22872b = qh.f24495b.newDecoder();

    @Override // com.yandex.mobile.ads.impl.r11
    public final Metadata a(ke0 ke0Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder;
        String str = null;
        try {
            string = this.f22871a.decode(byteBuffer).toString();
            charsetDecoder = this.f22871a;
        } catch (CharacterCodingException unused) {
            this.f22871a.reset();
            byteBuffer.rewind();
            try {
                string = this.f22872b.decode(byteBuffer).toString();
                charsetDecoder = this.f22872b;
            } catch (CharacterCodingException unused2) {
                this.f22872b.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                this.f22872b.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            this.f22871a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f22870c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strB = na.b(strGroup);
                Objects.requireNonNull(strB);
                if (strB.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strB.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
