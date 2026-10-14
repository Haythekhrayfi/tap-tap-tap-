package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqq extends zzbqw {
    public static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzcez zzk;
    private final Activity zzl;
    private zzcgo zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbqx zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbqq(zzcez zzcezVar, zzbqx zzbqxVar) {
        super(zzcezVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzcezVar;
        this.zzl = zzcezVar.zzi();
        this.zzp = zzbqxVar;
    }

    public final void zza(boolean z10) {
        synchronized (this.zzj) {
            PopupWindow popupWindow = this.zzq;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.zzr.removeView((View) this.zzk);
                ViewGroup viewGroup = this.zzs;
                if (viewGroup != null) {
                    viewGroup.removeView(this.zzn);
                    this.zzs.addView((View) this.zzk);
                    this.zzk.zzag(this.zzm);
                }
                if (z10) {
                    zzk("default");
                    zzbqx zzbqxVar = this.zzp;
                    if (zzbqxVar != null) {
                        zzbqxVar.zzb();
                    }
                }
                this.zzq = null;
                this.zzr = null;
                this.zzs = null;
                this.zzo = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:125:0x024e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0251 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:210:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0258 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:210:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0367  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e3 A[Catch: all -> 0x046c, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:9:0x0012, B:11:0x001a, B:12:0x001f, B:14:0x0021, B:16:0x002d, B:17:0x0032, B:19:0x0034, B:21:0x003c, B:23:0x004a, B:24:0x005b, B:26:0x0069, B:27:0x007a, B:29:0x0088, B:30:0x0099, B:32:0x00a7, B:33:0x00b8, B:35:0x00c6, B:36:0x00d4, B:38:0x00e2, B:39:0x00e4, B:41:0x00e8, B:43:0x00ec, B:45:0x00f4, B:48:0x00fc, B:52:0x0122, B:124:0x024b, B:127:0x0251, B:128:0x0256, B:130:0x0258, B:132:0x0278, B:134:0x027c, B:136:0x0289, B:138:0x02c5, B:170:0x037e, B:171:0x0381, B:179:0x03a2, B:180:0x03ba, B:181:0x03db, B:183:0x03e3, B:184:0x03ea, B:185:0x0411, B:188:0x0414, B:190:0x0439, B:191:0x044e, B:172:0x0385, B:173:0x0389, B:174:0x038d, B:175:0x0390, B:176:0x0394, B:177:0x039a, B:178:0x039e, B:137:0x02c2, B:193:0x0450, B:194:0x0455, B:59:0x0132, B:61:0x0136, B:89:0x0189, B:97:0x01d9, B:99:0x01e4, B:101:0x01e7, B:103:0x01ea, B:105:0x01ee, B:108:0x01f4, B:90:0x0194, B:92:0x01aa, B:94:0x01b5, B:91:0x019f, B:93:0x01ad, B:95:0x01ba, B:96:0x01ce, B:98:0x01dc, B:109:0x0205, B:115:0x022f, B:121:0x023f, B:118:0x0235, B:120:0x023d, B:112:0x0227, B:114:0x022d, B:196:0x0457, B:197:0x045c, B:199:0x045e, B:200:0x0463, B:202:0x0465, B:203:0x046a), top: B:210:0x0007, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x017c  */
    public final void zzb(Map map) {
        String str;
        int[] iArr;
        ViewParent parent;
        byte b10;
        int i10;
        int i11;
        zzbqx zzbqxVar;
        byte b11;
        int i12;
        int i13;
        int i14;
        int i15;
        synchronized (this.zzj) {
            if (this.zzl == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzk.zzO() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzk.zzO().zzi()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzk.zzaA()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzi = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzp();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzK((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzc = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str2 = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str2)) {
                this.zzb = str2;
            }
            if (this.zzi < 0 || this.zzf < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzl.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] iArrZzR = com.google.android.gms.ads.internal.util.zzs.zzR(this.zzl);
                com.google.android.gms.ads.internal.zzt.zzp();
                int[] iArrZzN = com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl);
                int i16 = iArrZzR[0];
                int i17 = iArrZzR[1];
                int i18 = this.zzi;
                if (i18 < 50 || i18 > i16) {
                    str = "Width is too small or too large.";
                } else {
                    int i19 = this.zzf;
                    if (i19 < 50 || i19 > i17) {
                        str = "Height is too small or too large.";
                    } else {
                        if (i19 == i17 && i18 == i16) {
                            str = "Cannot resize to a full-screen ad.";
                        } else if (this.zzc) {
                            switch (this.zzb) {
                                case "center":
                                    b11 = 2;
                                    break;
                                case "top-left":
                                    b11 = 0;
                                    break;
                                case "bottom-left":
                                    b11 = 3;
                                    break;
                                case "bottom-right":
                                    b11 = 5;
                                    break;
                                case "bottom-center":
                                    b11 = 4;
                                    break;
                                case "top-center":
                                    b11 = 1;
                                    break;
                                default:
                                    b11 = -1;
                                    break;
                            }
                            if (b11 == 0) {
                                i12 = this.zzd + this.zzg;
                                i13 = this.zze;
                            } else if (b11 != 1) {
                                if (b11 != 2) {
                                    if (b11 == 3) {
                                        i12 = this.zzd + this.zzg;
                                        i15 = this.zze;
                                    } else if (b11 == 4) {
                                        i12 = ((this.zzd + this.zzg) + (i18 >> 1)) - 25;
                                        i15 = this.zze;
                                    } else if (b11 != 5) {
                                        i12 = ((this.zzd + this.zzg) + i18) - 50;
                                        i13 = this.zze;
                                    } else {
                                        i12 = ((this.zzd + this.zzg) + i18) - 50;
                                        i15 = this.zze;
                                    }
                                    i14 = ((i15 + this.zzh) + i19) - 50;
                                } else {
                                    i12 = ((this.zzd + this.zzg) + (i18 >> 1)) - 25;
                                    i14 = ((this.zze + this.zzh) + (i19 >> 1)) - 25;
                                }
                                if (i12 >= 0 || i12 + 50 > i16 || i14 < iArrZzN[0] || i14 + 50 > iArrZzN[1]) {
                                    iArr = null;
                                } else {
                                    iArr = new int[]{this.zzd + this.zzg, this.zze + this.zzh};
                                }
                            } else {
                                i12 = ((this.zzd + this.zzg) + (i18 >> 1)) - 25;
                                i13 = this.zze;
                            }
                            i14 = i13 + this.zzh;
                            if (i12 >= 0) {
                                iArr = null;
                            } else {
                                iArr = null;
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzp();
                            int[] iArrZzR2 = com.google.android.gms.ads.internal.util.zzs.zzR(this.zzl);
                            com.google.android.gms.ads.internal.zzt.zzp();
                            int[] iArrZzN2 = com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl);
                            int i20 = iArrZzR2[0];
                            int i21 = this.zzd + this.zzg;
                            int i22 = this.zze + this.zzh;
                            if (i21 < 0) {
                                i21 = 0;
                            } else {
                                int i23 = this.zzi;
                                if (i21 + i23 > i20) {
                                    i21 = i20 - i23;
                                }
                            }
                            int i24 = iArrZzN2[0];
                            if (i22 < i24) {
                                i22 = i24;
                            } else {
                                int i25 = this.zzf;
                                int i26 = i22 + i25;
                                int i27 = iArrZzN2[1];
                                if (i26 > i27) {
                                    i22 = i27 - i25;
                                }
                            }
                            iArr = new int[]{i21, i22};
                        }
                        if (iArr == null) {
                            zzg("Resize location out of screen or close button is not visible.");
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int iZzx = zzbzk.zzx(this.zzl, this.zzi);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int iZzx2 = zzbzk.zzx(this.zzl, this.zzf);
                        parent = ((View) this.zzk).getParent();
                        if (parent != null || !(parent instanceof ViewGroup)) {
                            zzg("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.removeView((View) this.zzk);
                        PopupWindow popupWindow = this.zzq;
                        if (popupWindow == null) {
                            this.zzs = viewGroup;
                            com.google.android.gms.ads.internal.zzt.zzp();
                            Object obj = this.zzk;
                            ((View) obj).setDrawingCacheEnabled(true);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                            ((View) obj).setDrawingCacheEnabled(false);
                            ImageView imageView = new ImageView(this.zzl);
                            this.zzn = imageView;
                            imageView.setImageBitmap(bitmapCreateBitmap);
                            this.zzm = this.zzk.zzO();
                            this.zzs.addView(this.zzn);
                        } else {
                            popupWindow.dismiss();
                        }
                        RelativeLayout relativeLayout = new RelativeLayout(this.zzl);
                        this.zzr = relativeLayout;
                        relativeLayout.setBackgroundColor(0);
                        this.zzr.setLayoutParams(new ViewGroup.LayoutParams(iZzx, iZzx2));
                        com.google.android.gms.ads.internal.zzt.zzp();
                        PopupWindow popupWindow2 = new PopupWindow((View) this.zzr, iZzx, iZzx2, false);
                        this.zzq = popupWindow2;
                        popupWindow2.setOutsideTouchable(false);
                        this.zzq.setTouchable(true);
                        this.zzq.setClippingEnabled(!this.zzc);
                        this.zzr.addView((View) this.zzk, -1, -1);
                        this.zzo = new LinearLayout(this.zzl);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        int iZzx3 = zzbzk.zzx(this.zzl, 50);
                        com.google.android.gms.ads.internal.client.zzay.zzb();
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzx3, zzbzk.zzx(this.zzl, 50));
                        switch (this.zzb) {
                            case "center":
                                b10 = 2;
                                break;
                            case "top-left":
                                b10 = 0;
                                break;
                            case "bottom-left":
                                b10 = 3;
                                break;
                            case "bottom-right":
                                b10 = 5;
                                break;
                            case "bottom-center":
                                b10 = 4;
                                break;
                            case "top-center":
                                b10 = 1;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        try {
                            if (b10 != 0) {
                                int i28 = 14;
                                if (b10 != 1) {
                                    if (b10 == 2) {
                                        layoutParams.addRule(13);
                                    } else if (b10 == 3) {
                                        layoutParams.addRule(12);
                                    } else if (b10 != 4) {
                                        i28 = 11;
                                        if (b10 != 5) {
                                            layoutParams.addRule(10);
                                        } else {
                                            layoutParams.addRule(12);
                                        }
                                    } else {
                                        layoutParams.addRule(12);
                                    }
                                    this.zzo.setOnClickListener(new zzbqp(this));
                                    this.zzo.setContentDescription("Close button");
                                    this.zzr.addView(this.zzo, layoutParams);
                                    PopupWindow popupWindow3 = this.zzq;
                                    View decorView = window.getDecorView();
                                    com.google.android.gms.ads.internal.client.zzay.zzb();
                                    int iZzx4 = zzbzk.zzx(this.zzl, iArr[0]);
                                    com.google.android.gms.ads.internal.client.zzay.zzb();
                                    popupWindow3.showAtLocation(decorView, 0, iZzx4, zzbzk.zzx(this.zzl, iArr[1]));
                                    i10 = iArr[0];
                                    i11 = iArr[1];
                                    zzbqxVar = this.zzp;
                                    if (zzbqxVar != null) {
                                        zzbqxVar.zza(i10, i11, this.zzi, this.zzf);
                                    }
                                    this.zzk.zzag(zzcgo.zzb(iZzx, iZzx2));
                                    int i29 = iArr[0];
                                    int i30 = iArr[1];
                                    com.google.android.gms.ads.internal.zzt.zzp();
                                    zzj(i29, i30 - com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl)[0], this.zzi, this.zzf);
                                    zzk("resized");
                                    return;
                                }
                                layoutParams.addRule(10);
                                layoutParams.addRule(i28);
                                this.zzo.setOnClickListener(new zzbqp(this));
                                this.zzo.setContentDescription("Close button");
                                this.zzr.addView(this.zzo, layoutParams);
                                PopupWindow popupWindow4 = this.zzq;
                                View decorView2 = window.getDecorView();
                                com.google.android.gms.ads.internal.client.zzay.zzb();
                                int iZzx5 = zzbzk.zzx(this.zzl, iArr[0]);
                                com.google.android.gms.ads.internal.client.zzay.zzb();
                                popupWindow4.showAtLocation(decorView2, 0, iZzx5, zzbzk.zzx(this.zzl, iArr[1]));
                                i10 = iArr[0];
                                i11 = iArr[1];
                                zzbqxVar = this.zzp;
                                if (zzbqxVar != null) {
                                    zzbqxVar.zza(i10, i11, this.zzi, this.zzf);
                                }
                                this.zzk.zzag(zzcgo.zzb(iZzx, iZzx2));
                                int i210 = iArr[0];
                                int i31 = iArr[1];
                                com.google.android.gms.ads.internal.zzt.zzp();
                                zzj(i210, i31 - com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl)[0], this.zzi, this.zzf);
                                zzk("resized");
                                return;
                            }
                            layoutParams.addRule(10);
                            PopupWindow popupWindow5 = this.zzq;
                            View decorView3 = window.getDecorView();
                            com.google.android.gms.ads.internal.client.zzay.zzb();
                            int iZzx6 = zzbzk.zzx(this.zzl, iArr[0]);
                            com.google.android.gms.ads.internal.client.zzay.zzb();
                            popupWindow5.showAtLocation(decorView3, 0, iZzx6, zzbzk.zzx(this.zzl, iArr[1]));
                            i10 = iArr[0];
                            i11 = iArr[1];
                            zzbqxVar = this.zzp;
                            if (zzbqxVar != null) {
                                zzbqxVar.zza(i10, i11, this.zzi, this.zzf);
                            }
                            this.zzk.zzag(zzcgo.zzb(iZzx, iZzx2));
                            int i211 = iArr[0];
                            int i32 = iArr[1];
                            com.google.android.gms.ads.internal.zzt.zzp();
                            zzj(i211, i32 - com.google.android.gms.ads.internal.util.zzs.zzN(this.zzl)[0], this.zzi, this.zzf);
                            zzk("resized");
                            return;
                        } catch (RuntimeException e10) {
                            zzg("Cannot show popup window: " + e10.getMessage());
                            this.zzr.removeView((View) this.zzk);
                            ViewGroup viewGroup2 = this.zzs;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(this.zzn);
                                this.zzs.addView((View) this.zzk);
                                this.zzk.zzag(this.zzm);
                            }
                            return;
                        }
                        layoutParams.addRule(9);
                        this.zzo.setOnClickListener(new zzbqp(this));
                        this.zzo.setContentDescription("Close button");
                        this.zzr.addView(this.zzo, layoutParams);
                    }
                }
                zzbzr.zzj(str);
                iArr = null;
                if (iArr == null) {
                    zzg("Resize location out of screen or close button is not visible.");
                    return;
                }
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int iZzx7 = zzbzk.zzx(this.zzl, this.zzi);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int iZzx8 = zzbzk.zzx(this.zzl, this.zzf);
                parent = ((View) this.zzk).getParent();
                if (parent != null) {
                }
                zzg("Webview is detached, probably in the middle of a resize or expand.");
                return;
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzj) {
            this.zzd = i10;
            this.zze = i11;
        }
    }

    public final void zzd(int i10, int i11) {
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean zze() {
        boolean z10;
        synchronized (this.zzj) {
            z10 = this.zzq != null;
        }
        return z10;
    }
}
