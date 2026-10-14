package com.applovin.exoplayer2.g.d;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f6337a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f6338b = Charsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetDecoder f6339c = Charsets.ISO_8859_1.newDecoder();

    private String a(ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder;
        try {
            string = this.f6338b.decode(byteBuffer).toString();
            charsetDecoder = this.f6338b;
        } catch (CharacterCodingException unused) {
            this.f6338b.reset();
            byteBuffer.rewind();
            try {
                string = this.f6339c.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                string = null;
            } catch (Throwable th) {
                this.f6339c.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f6339c;
        } catch (Throwable th2) {
            this.f6338b.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return string;
    }

    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        String strA = a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strA == null) {
            return new com.applovin.exoplayer2.g.a(new c(bArr, null, null));
        }
        Matcher matcher = f6337a.matcher(strA);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = Ascii.toLowerCase(strGroup);
                Objects.requireNonNull(lowerCase);
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new com.applovin.exoplayer2.g.a(new c(bArr, str, str2));
    }
}
