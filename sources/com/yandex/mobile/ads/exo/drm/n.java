package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.d.a0;
import com.yandex.mobile.ads.impl.au0;
import com.yandex.mobile.ads.impl.cg;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.ew;
import com.yandex.mobile.ads.impl.fw;
import com.yandex.mobile.ads.impl.gr0;
import com.yandex.mobile.ads.impl.l91;
import com.yandex.mobile.ads.impl.mp0;
import com.yandex.mobile.ads.impl.ot0;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.qh;
import com.yandex.mobile.ads.impl.yl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import y9.l8;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final fw f18506d = ot0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m.c f18507e = l8.f41384y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f18508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f18509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18510c;

    public static class a {
        public static void a(MediaDrm mediaDrm, byte[] bArr, gr0 gr0Var) {
            LogSessionId logSessionIdA = gr0Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            Objects.requireNonNull(playbackComponent);
            playbackComponent.setLogSessionId(logSessionIdA);
        }

        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private n(UUID uuid) throws UnsupportedSchemeException {
        pa.a(uuid);
        pa.a("Use C.CLEARKEY_UUID instead", !cg.f19499b.equals(uuid));
        this.f18508a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f18509b = mediaDrm;
        this.f18510c = 1;
        if (cg.f19501d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    private static UUID a(UUID uuid) {
        return (da1.f19803a >= 27 || !cg.f19500c.equals(uuid)) ? uuid : cg.f19499b;
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        c.HandlerC0193c handlerC0193c = c.this.f18472y;
        Objects.requireNonNull(handlerC0193c);
        handlerC0193c.obtainMessage(i10, bArr).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m b(UUID uuid) {
        try {
            return c(uuid);
        } catch (l91 unused) {
            p90.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    public static n c(UUID uuid) throws l91 {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new l91(e10);
        } catch (Exception e11) {
            throw new l91(e11);
        }
    }

    private static boolean d() {
        return f18506d.f().equals(da1.f19806d);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    @Override // com.yandex.mobile.ads.exo.drm.m
    @SuppressLint({"WrongConstant"})
    public final m.a a(byte[] bArr, List<DrmInitData.SchemeData> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        boolean z10;
        DrmInitData.SchemeData schemeData;
        byte[] bArrA;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (cg.f19501d.equals(this.f18508a)) {
                if (da1.f19803a >= 28 && list.size() > 1) {
                    DrmInitData.SchemeData schemeData3 = list.get(0);
                    int i11 = 0;
                    int length = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            z10 = true;
                            break;
                        }
                        DrmInitData.SchemeData schemeData4 = list.get(i11);
                        byte[] bArr3 = schemeData4.f18417e;
                        Objects.requireNonNull(bArr3);
                        if (!da1.a(schemeData4.f18416d, schemeData3.f18416d) || !da1.a(schemeData4.f18415c, schemeData3.f18415c) || !au0.a(bArr3)) {
                            z10 = false;
                            break;
                        }
                        length += bArr3.length;
                        i11++;
                    }
                    if (z10) {
                        byte[] bArr4 = new byte[length];
                        int i12 = 0;
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            byte[] bArr5 = list.get(i13).f18417e;
                            Objects.requireNonNull(bArr5);
                            int length2 = bArr5.length;
                            System.arraycopy(bArr5, 0, bArr4, i12, length2);
                            i12 += length2;
                        }
                        schemeData = new DrmInitData.SchemeData(schemeData3.f18414b, schemeData3.f18415c, schemeData3.f18416d, bArr4);
                        schemeData2 = schemeData;
                    }
                }
                int i14 = 0;
                while (true) {
                    if (i14 < list.size()) {
                        DrmInitData.SchemeData schemeData5 = list.get(i14);
                        byte[] bArr6 = schemeData5.f18417e;
                        Objects.requireNonNull(bArr6);
                        int iD = au0.d(bArr6);
                        int i15 = da1.f19803a;
                        if ((i15 >= 23 || iD != 0) && (i15 < 23 || iD != 1)) {
                            i14++;
                        } else {
                            schemeData2 = schemeData5;
                        }
                    } else {
                        schemeData = list.get(0);
                        schemeData2 = schemeData;
                    }
                }
            } else {
                schemeData = list.get(0);
                schemeData2 = schemeData;
            }
            UUID uuid = this.f18508a;
            byte[] bArrArray = schemeData2.f18417e;
            Objects.requireNonNull(bArrArray);
            UUID uuid2 = cg.f19502e;
            if (uuid2.equals(uuid)) {
                byte[] bArrA2 = au0.a(uuid, bArrArray);
                if (bArrA2 != null) {
                    bArrArray = bArrA2;
                }
                mp0 mp0Var = new mp0(bArrArray);
                int iK = mp0Var.k();
                short sM = mp0Var.m();
                short sM2 = mp0Var.m();
                if (sM == 1 && sM2 == 1) {
                    short sM3 = mp0Var.m();
                    Charset charset = qh.f24497d;
                    String strA = mp0Var.a(sM3, charset);
                    if (!strA.contains("<LA_URL>")) {
                        int iIndexOf = strA.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            p90.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strA.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strA.substring(iIndexOf);
                        int i16 = iK + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i16);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i16);
                        byteBufferAllocate.putShort(sM);
                        byteBufferAllocate.putShort(sM2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrArray = byteBufferAllocate.array();
                    }
                } else {
                    p90.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                int length3 = (bArrArray != null ? bArrArray.length : 0) + 32;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(length3);
                byteBufferAllocate2.putInt(length3);
                byteBufferAllocate2.putInt(1886614376);
                byteBufferAllocate2.putInt(0);
                byteBufferAllocate2.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArrArray != null && bArrArray.length != 0) {
                    byteBufferAllocate2.putInt(bArrArray.length);
                    byteBufferAllocate2.put(bArrArray);
                }
                bArrArray = byteBufferAllocate2.array();
            }
            int i17 = da1.f19803a;
            if (i17 >= 23 || !cg.f19501d.equals(uuid)) {
                if (uuid2.equals(uuid)) {
                    fw fwVar = f18506d;
                    if (fwVar.e().equals(da1.f19805c)) {
                        String strA2 = fwVar.a();
                        String str3 = da1.f19806d;
                        if (strA2.equals(str3) || fwVar.c().equals(str3) || fwVar.b().equals(str3) || fwVar.d().equals(str3)) {
                            bArrA = au0.a(uuid, bArrArray);
                            if (bArrA == null) {
                            }
                        }
                    }
                }
                bArrA = bArrArray;
            } else {
                bArrA = au0.a(uuid, bArrArray);
                if (bArrA == null) {
                    bArrA = bArrArray;
                }
            }
            UUID uuid3 = this.f18508a;
            String str4 = schemeData2.f18416d;
            if (i17 < 26 && cg.f19500c.equals(uuid3) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) {
                bArr2 = bArrA;
                str = "cenc";
            } else {
                bArr2 = bArrA;
                str = str4;
            }
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f18509b.getKeyRequest(bArr, bArr2, str, i10, map);
        UUID uuid4 = this.f18508a;
        byte[] data = keyRequest.getData();
        if (cg.f19500c.equals(uuid4) && da1.f19803a < 27) {
            data = da1.a(data).replace('+', CoreConstants.DASH_CHAR).replace('/', '_').getBytes(qh.f24496c);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null && !TextUtils.isEmpty(schemeData2.f18415c)) {
            defaultUrl = schemeData2.f18415c;
        }
        if (da1.f19803a >= 23) {
            keyRequest.getRequestType();
        }
        return new m.a(defaultUrl, data);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final m.d a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f18509b.getProvisionRequest();
        return new m.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final Map<String, String> a(byte[] bArr) {
        return this.f18509b.queryKeyStatus(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(m.b bVar) {
        this.f18509b.setOnEventListener(new a0(this, bVar));
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(byte[] bArr, gr0 gr0Var) {
        if (da1.f19803a >= 31) {
            try {
                a.a(this.f18509b, bArr, gr0Var);
            } catch (UnsupportedOperationException unused) {
                p90.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f18509b.restoreKeys(bArr, bArr2);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final boolean a(String str, byte[] bArr) {
        if (da1.f19803a >= 31) {
            return a.a(this.f18509b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f18508a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final int b() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void b(byte[] bArr) {
        this.f18509b.closeSession(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final byte[] b(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (cg.f19500c.equals(this.f18508a)) {
            bArr2 = com.yandex.mobile.ads.exo.drm.a.a(bArr2);
        }
        return this.f18509b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f18509b.provideProvisionResponse(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final byte[] c() throws MediaDrmException {
        return this.f18509b.openSession();
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final yl d(byte[] bArr) throws MediaCryptoException {
        return new ew(a(this.f18508a), bArr, da1.f19803a < 21 && cg.f19501d.equals(this.f18508a) && "L3".equals(this.f18509b.getPropertyString("securityLevel")));
    }

    @Override // com.yandex.mobile.ads.exo.drm.m
    public final synchronized void release() {
        int i10 = this.f18510c - 1;
        this.f18510c = i10;
        if (i10 == 0) {
            this.f18509b.release();
        }
    }
}
