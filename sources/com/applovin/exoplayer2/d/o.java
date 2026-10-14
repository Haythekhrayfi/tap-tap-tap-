package com.applovin.exoplayer2.d;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.c f5160a = new m.c() { // from class: com.applovin.exoplayer2.d.b0
        @Override // com.applovin.exoplayer2.d.m.c
        public final m acquireExoMediaDrm(UUID uuid) {
            return o.c(uuid);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f5161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaDrm f5162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5163d;

    public static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private o(UUID uuid) throws UnsupportedSchemeException {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.f6458b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f5161b = uuid;
        MediaDrm mediaDrm = new MediaDrm(b(uuid));
        this.f5162c = mediaDrm;
        this.f5163d = 1;
        if (com.applovin.exoplayer2.h.f6460d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    private static e.a a(UUID uuid, List<e.a> list) {
        boolean z10;
        if (com.applovin.exoplayer2.h.f6460d.equals(uuid)) {
            if (ai.f7595a >= 28 && list.size() > 1) {
                e.a aVar = list.get(0);
                int i10 = 0;
                int length = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    e.a aVar2 = list.get(i10);
                    byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar2.f5139d);
                    if (!ai.a((Object) aVar2.f5138c, (Object) aVar.f5138c) || !ai.a((Object) aVar2.f5137b, (Object) aVar.f5137b) || !com.applovin.exoplayer2.e.g.h.a(bArr)) {
                        z10 = false;
                        break;
                    }
                    length += bArr.length;
                    i10++;
                }
                if (z10) {
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        byte[] bArr3 = (byte[]) com.applovin.exoplayer2.l.a.b(list.get(i12).f5139d);
                        int length2 = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i11, length2);
                        i11 += length2;
                    }
                    return aVar.a(bArr2);
                }
            }
            for (int i13 = 0; i13 < list.size(); i13++) {
                e.a aVar3 = list.get(i13);
                int iC = com.applovin.exoplayer2.e.g.h.c((byte[]) com.applovin.exoplayer2.l.a.b(aVar3.f5139d));
                int i14 = ai.f7595a;
                if (i14 < 23 && iC == 0) {
                    return aVar3;
                }
                if (i14 >= 23 && iC == 1) {
                    return aVar3;
                }
            }
        }
        return list.get(0);
    }

    public static o a(UUID uuid) throws t {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new t(1, e10);
        } catch (Exception e11) {
            throw new t(2, e11);
        }
    }

    private static String a(UUID uuid, String str) {
        return (ai.f7595a < 26 && com.applovin.exoplayer2.h.f6459c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    @SuppressLint({"WrongConstant"})
    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] a(UUID uuid, byte[] bArr) {
        byte[] bArrA;
        UUID uuid2 = com.applovin.exoplayer2.h.f6461e;
        if (uuid2.equals(uuid)) {
            byte[] bArrA2 = com.applovin.exoplayer2.e.g.h.a(bArr, uuid);
            if (bArrA2 != null) {
                bArr = bArrA2;
            }
            bArr = com.applovin.exoplayer2.e.g.h.a(uuid2, f(bArr));
        }
        if (ai.f7595a < 23 && com.applovin.exoplayer2.h.f6460d.equals(uuid)) {
            bArrA = com.applovin.exoplayer2.e.g.h.a(bArr, uuid);
            if (bArrA != null) {
                return bArrA;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(ai.f7597c)) {
            String str = ai.f7598d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrA = com.applovin.exoplayer2.e.g.h.a(bArr, uuid);
                if (bArrA != null) {
                    return bArrA;
                }
            }
        }
        return bArr;
    }

    private static UUID b(UUID uuid) {
        return (ai.f7595a >= 27 || !com.applovin.exoplayer2.h.f6459c.equals(uuid)) ? uuid : com.applovin.exoplayer2.h.f6458b;
    }

    private static byte[] b(UUID uuid, byte[] bArr) {
        return com.applovin.exoplayer2.h.f6459c.equals(uuid) ? com.applovin.exoplayer2.d.a.a(bArr) : bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m c(UUID uuid) {
        try {
            return a(uuid);
        } catch (t unused) {
            com.applovin.exoplayer2.l.q.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(ai.f7598d);
    }

    private static byte[] f(byte[] bArr) {
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(bArr);
        int iR = yVar.r();
        short sL = yVar.l();
        short sL2 = yVar.l();
        if (sL != 1 || sL2 != 1) {
            com.applovin.exoplayer2.l.q.b("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sL3 = yVar.l();
        Charset charset = Charsets.UTF_16LE;
        String strA = yVar.a(sL3, charset);
        if (strA.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strA.indexOf("</DATA>");
        if (iIndexOf == -1) {
            com.applovin.exoplayer2.l.q.c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strA.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strA.substring(iIndexOf);
        int i10 = iR + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sL);
        byteBufferAllocate.putShort(sL2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    @Override // com.applovin.exoplayer2.d.m
    public m.a a(byte[] bArr, List<e.a> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArrA;
        String strA;
        e.a aVarA = null;
        if (list != null) {
            aVarA = a(this.f5161b, list);
            bArrA = a(this.f5161b, (byte[]) com.applovin.exoplayer2.l.a.b(aVarA.f5139d));
            strA = a(this.f5161b, aVarA.f5138c);
        } else {
            bArrA = null;
            strA = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f5162c.getKeyRequest(bArr, bArrA, strA, i10, map);
        byte[] bArrB = b(this.f5161b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && aVarA != null && !TextUtils.isEmpty(aVarA.f5137b)) {
            defaultUrl = aVarA.f5137b;
        }
        return new m.a(bArrB, defaultUrl, ai.f7595a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    public String a(String str) {
        return this.f5162c.getPropertyString(str);
    }

    @Override // com.applovin.exoplayer2.d.m
    public void a(m.b bVar) {
        this.f5162c.setOnEventListener(bVar == null ? null : new a0(this, bVar));
    }

    @Override // com.applovin.exoplayer2.d.m
    public void a(byte[] bArr) {
        this.f5162c.closeSession(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public boolean a(byte[] bArr, String str) {
        if (ai.f7595a >= 31) {
            return a.a(this.f5162c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f5161b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.applovin.exoplayer2.d.m
    public byte[] a() throws MediaDrmException {
        return this.f5162c.openSession();
    }

    @Override // com.applovin.exoplayer2.d.m
    public byte[] a(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (com.applovin.exoplayer2.h.f6459c.equals(this.f5161b)) {
            bArr2 = com.applovin.exoplayer2.d.a.b(bArr2);
        }
        return this.f5162c.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.applovin.exoplayer2.d.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f5162c.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.exoplayer2.d.m
    public void b(byte[] bArr) throws DeniedByServerException {
        this.f5162c.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public void b(byte[] bArr, byte[] bArr2) {
        this.f5162c.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.exoplayer2.d.m
    public Map<String, String> c(byte[] bArr) {
        return this.f5162c.queryKeyStatus(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public synchronized void c() {
        int i10 = this.f5163d - 1;
        this.f5163d = i10;
        if (i10 == 0) {
            this.f5162c.release();
        }
    }

    @Override // com.applovin.exoplayer2.d.m
    public int d() {
        return 2;
    }

    @Override // com.applovin.exoplayer2.d.m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n d(byte[] bArr) throws MediaCryptoException {
        return new n(b(this.f5161b), bArr, ai.f7595a < 21 && com.applovin.exoplayer2.h.f6460d.equals(this.f5161b) && "L3".equals(a("securityLevel")));
    }
}
