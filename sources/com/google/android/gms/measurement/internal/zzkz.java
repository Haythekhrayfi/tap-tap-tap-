package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.spi.CallerData;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoh;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkz implements zzgt {
    private static volatile zzkz zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzik zzD;
    private String zzE;

    @VisibleForTesting
    public long zza;
    private final zzfp zzc;
    private final zzeu zzd;
    private zzam zze;
    private zzew zzf;
    private zzkl zzg;
    private zzaa zzh;
    private final zzlb zzi;
    private zzii zzj;
    private zzju zzk;
    private final zzko zzl;
    private zzfg zzm;
    private final zzfy zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlg zzF = new zzku(this);

    public zzkz(zzla zzlaVar, zzfy zzfyVar) {
        Preconditions.checkNotNull(zzlaVar);
        this.zzn = zzfy.zzp(zzlaVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzko(this);
        zzlb zzlbVar = new zzlb(this);
        zzlbVar.zzX();
        this.zzi = zzlbVar;
        zzeu zzeuVar = new zzeu(this);
        zzeuVar.zzX();
        this.zzd = zzeuVar;
        zzfp zzfpVar = new zzfp(this);
        zzfpVar.zzX();
        this.zzc = zzfpVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaz().zzp(new zzkp(this, zzlaVar));
    }

    @VisibleForTesting
    public static final void zzaa(com.google.android.gms.internal.measurement.zzfr zzfrVar, int i10, String str) {
        List listZzp = zzfrVar.zzp();
        for (int i11 = 0; i11 < listZzp.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfw) listZzp.get(i11)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
        zzfvVarZze.zzj("_err");
        zzfvVarZze.zzi(Long.valueOf(i10).longValue());
        com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) zzfvVarZze.zzaE();
        com.google.android.gms.internal.measurement.zzfv zzfvVarZze2 = com.google.android.gms.internal.measurement.zzfw.zze();
        zzfvVarZze2.zzj("_ev");
        zzfvVarZze2.zzk(str);
        com.google.android.gms.internal.measurement.zzfw zzfwVar2 = (com.google.android.gms.internal.measurement.zzfw) zzfvVarZze2.zzaE();
        zzfrVar.zzf(zzfwVar);
        zzfrVar.zzf(zzfwVar2);
    }

    @VisibleForTesting
    public static final void zzab(com.google.android.gms.internal.measurement.zzfr zzfrVar, String str) {
        List listZzp = zzfrVar.zzp();
        for (int i10 = 0; i10 < listZzp.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfw) listZzp.get(i10)).zzg())) {
                zzfrVar.zzh(i10);
                return;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final zzq zzac(String str) {
        String str2;
        zzem zzemVarZzc;
        Object objZzn;
        String str3 = str;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str3);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            str2 = "No app data available; dropping";
            objZzn = str3;
            zzemVarZzc = zzay().zzc();
        } else {
            Boolean boolZzad = zzad(zzhVarZzj);
            if (boolZzad == null || boolZzad.booleanValue()) {
                String strZzy = zzhVarZzj.zzy();
                String strZzw = zzhVarZzj.zzw();
                long jZzb = zzhVarZzj.zzb();
                String strZzv = zzhVarZzj.zzv();
                long jZzm = zzhVarZzj.zzm();
                long jZzj = zzhVarZzj.zzj();
                boolean zZzai = zzhVarZzj.zzai();
                String strZzx = zzhVarZzj.zzx();
                zzhVarZzj.zza();
                return new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null);
            }
            zzem zzemVarZzd = zzay().zzd();
            str2 = "App version does not match; dropping. appId";
            objZzn = zzeo.zzn(str);
            zzemVarZzc = zzemVarZzd;
        }
        zzemVarZzc.zzb(str2, objZzn);
        return null;
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(zzhVar.zzt(), 0).versionName;
                String strZzw = zzhVar.zzw();
                if (strZzw != null && strZzw.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaz().zzg();
        if (this.zzt || this.zzu || this.zzv) {
            zzay().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
            return;
        }
        zzay().zzj().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    @VisibleForTesting
    private final void zzaf(com.google.android.gms.internal.measurement.zzgb zzgbVar, long j10, boolean z10) {
        zzle zzleVar;
        String str = true != z10 ? "_lte" : "_se";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzle zzleVarZzp = zzamVar.zzp(zzgbVar.zzap(), str);
        if (zzleVarZzp == null || zzleVarZzp.zze == null) {
            zzleVar = new zzle(zzgbVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(j10));
        } else {
            zzleVar = new zzle(zzgbVar.zzap(), "auto", str, zzav().currentTimeMillis(), Long.valueOf(((Long) zzleVarZzp.zze).longValue() + j10));
        }
        com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
        zzgkVarZzd.zzf(str);
        zzgkVarZzd.zzg(zzav().currentTimeMillis());
        zzgkVarZzd.zze(((Long) zzleVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVarZzd.zzaE();
        int iZza = zzlb.zza(zzgbVar, str);
        if (iZza >= 0) {
            zzgbVar.zzam(iZza, zzglVar);
        } else {
            zzgbVar.zzm(zzglVar);
        }
        if (j10 > 0) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzL(zzleVar);
            zzay().zzj().zzc("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", zzleVar.zze);
        }
    }

    private final void zzag() {
        zzea zzeaVar;
        long jMax;
        zzaz().zzg();
        zzB();
        if (this.zza > 0) {
            long jAbs = 3600000 - Math.abs(zzav().elapsedRealtime() - this.zza);
            if (jAbs > 0) {
                zzay().zzj().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                zzm().zzc();
                zzkl zzklVar = this.zzg;
                zzal(zzklVar);
                zzklVar.zza();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzM() || !zzai()) {
            zzay().zzj().zza("Nothing to upload or uploading impossible");
            zzm().zzc();
            zzkl zzklVar2 = this.zzg;
            zzal(zzklVar2);
            zzklVar2.zza();
            return;
        }
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzg();
        long jMax2 = Math.max(0L, ((Long) zzeb.zzz.zza(null)).longValue());
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        boolean z10 = true;
        if (!zzamVar.zzH()) {
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            if (!zzamVar2.zzG()) {
                z10 = false;
            }
        }
        if (z10) {
            String strZzl = zzg().zzl();
            if (TextUtils.isEmpty(strZzl) || ".none.".equals(strZzl)) {
                zzg();
                zzeaVar = zzeb.zzt;
            } else {
                zzg();
                zzeaVar = zzeb.zzu;
            }
        } else {
            zzg();
            zzeaVar = zzeb.zzs;
        }
        long jMax3 = Math.max(0L, ((Long) zzeaVar.zza(null)).longValue());
        long jZza = this.zzk.zzc.zza();
        long jZza2 = this.zzk.zzd.zza();
        zzam zzamVar3 = this.zze;
        zzal(zzamVar3);
        boolean z11 = z10;
        long jZzd = zzamVar3.zzd();
        zzam zzamVar4 = this.zze;
        zzal(zzamVar4);
        long jMax4 = Math.max(jZzd, zzamVar4.zze());
        if (jMax4 != 0) {
            long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
            long jAbs3 = Math.abs(jZza - jCurrentTimeMillis);
            long jAbs4 = jCurrentTimeMillis - Math.abs(jZza2 - jCurrentTimeMillis);
            long jMax5 = Math.max(jCurrentTimeMillis - jAbs3, jAbs4);
            jMax = jAbs2 + jMax2;
            if (z11 && jMax5 > 0) {
                jMax = Math.min(jAbs2, jMax5) + jMax3;
            }
            zzlb zzlbVar = this.zzi;
            zzal(zzlbVar);
            if (!zzlbVar.zzw(jMax5, jMax3)) {
                jMax = jMax5 + jMax3;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i10 = 0;
                while (true) {
                    zzg();
                    if (i10 >= Math.min(20, Math.max(0, ((Integer) zzeb.zzB.zza(null)).intValue()))) {
                        jMax = 0;
                        break;
                    }
                    zzg();
                    jMax += Math.max(0L, ((Long) zzeb.zzA.zza(null)).longValue()) * (1 << i10);
                    if (jMax > jAbs4) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        } else {
            jMax = 0;
            break;
        }
        if (jMax == 0) {
            zzay().zzj().zza("Next upload time is 0");
            zzm().zzc();
            zzkl zzklVar3 = this.zzg;
            zzal(zzklVar3);
            zzklVar3.zza();
            return;
        }
        zzeu zzeuVar = this.zzd;
        zzal(zzeuVar);
        if (!zzeuVar.zza()) {
            zzay().zzj().zza("No network");
            zzm().zzb();
            zzkl zzklVar4 = this.zzg;
            zzal(zzklVar4);
            zzklVar4.zza();
            return;
        }
        long jZza3 = this.zzk.zzb.zza();
        zzg();
        long jMax6 = Math.max(0L, ((Long) zzeb.zzq.zza(null)).longValue());
        zzlb zzlbVar2 = this.zzi;
        zzal(zzlbVar2);
        if (!zzlbVar2.zzw(jZza3, jMax6)) {
            jMax = Math.max(jMax, jZza3 + jMax6);
        }
        zzm().zzc();
        long jCurrentTimeMillis2 = jMax - zzav().currentTimeMillis();
        if (jCurrentTimeMillis2 <= 0) {
            zzg();
            jCurrentTimeMillis2 = Math.max(0L, ((Long) zzeb.zzv.zza(null)).longValue());
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzay().zzj().zzb("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
        zzkl zzklVar5 = this.zzg;
        zzal(zzklVar5);
        zzklVar5.zzd(jCurrentTimeMillis2);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0376 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x038e A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x03a7 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x03bd A[Catch: all -> 0x0d0d, TRY_ENTER, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:118:0x03cf A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x03df  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:125:0x03e8 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x041c  */
    /* JADX WARN: Code duplicated, block: B:133:0x041d A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x042e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0435 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x043f A[Catch: all -> 0x0d0d, LOOP:3: B:136:0x042f->B:140:0x043f, LOOP_END, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x045e  */
    /* JADX WARN: Code duplicated, block: B:145:0x046b A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x047c  */
    /* JADX WARN: Code duplicated, block: B:155:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:157:0x04c5 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x04d5 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:170:0x051f A[PHI: r6 r10
  0x051f: PHI (r6v68 int) = (r6v67 int), (r6v67 int), (r6v71 int) binds: [B:158:0x04d3, B:160:0x04e6, B:156:0x04c0] A[DONT_GENERATE, DONT_INLINE]
  0x051f: PHI (r10v52 com.google.android.gms.internal.measurement.zzgb) = 
  (r10v50 com.google.android.gms.internal.measurement.zzgb)
  (r10v50 com.google.android.gms.internal.measurement.zzgb)
  (r10v54 com.google.android.gms.internal.measurement.zzgb)
 binds: [B:158:0x04d3, B:160:0x04e6, B:156:0x04c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x056e A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0579 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x057f A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0588  */
    /* JADX WARN: Code duplicated, block: B:287:0x08e8 A[PHI: r3
  0x08e8: PHI (r3v23 com.google.android.gms.measurement.internal.zzas) = (r3v22 com.google.android.gms.measurement.internal.zzas), (r3v35 com.google.android.gms.measurement.internal.zzas) binds: [B:283:0x0892, B:285:0x08a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:373:0x0b78 A[Catch: all -> 0x0d0d, TryCatch #3 {all -> 0x0d0d, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:173:0x0538, B:24:0x00f3, B:26:0x0101, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:111:0x03a7, B:112:0x03b3, B:115:0x03bd, B:121:0x03e0, B:118:0x03cf, B:143:0x045f, B:145:0x046b, B:148:0x047e, B:150:0x048f, B:152:0x049b, B:172:0x0524, B:157:0x04c5, B:159:0x04d5, B:162:0x04ea, B:164:0x04fb, B:166:0x0507, B:125:0x03e8, B:127:0x03f4, B:129:0x0400, B:141:0x0445, B:133:0x041d, B:136:0x042f, B:138:0x0435, B:140:0x043f, B:68:0x01e4, B:71:0x01ee, B:73:0x01fc, B:77:0x0243, B:74:0x0219, B:76:0x022a, B:81:0x0252, B:83:0x027e, B:84:0x02a8, B:86:0x02de, B:88:0x02e4, B:91:0x02f0, B:93:0x0326, B:94:0x0341, B:96:0x0347, B:98:0x0355, B:102:0x0368, B:99:0x035d, B:105:0x036f, B:108:0x0376, B:109:0x038e, B:176:0x054d, B:178:0x055b, B:180:0x0566, B:191:0x0598, B:181:0x056e, B:183:0x0579, B:185:0x057f, B:188:0x058b, B:190:0x0593, B:192:0x059b, B:193:0x05a7, B:196:0x05af, B:198:0x05c1, B:199:0x05cd, B:201:0x05d5, B:205:0x05fa, B:207:0x061f, B:209:0x0630, B:211:0x0636, B:213:0x0642, B:214:0x0673, B:216:0x0679, B:218:0x0687, B:219:0x068b, B:220:0x068e, B:221:0x0691, B:222:0x069f, B:224:0x06a5, B:226:0x06b5, B:227:0x06bc, B:229:0x06c8, B:230:0x06cf, B:231:0x06d2, B:233:0x0712, B:234:0x0725, B:236:0x072b, B:239:0x0745, B:241:0x0760, B:243:0x0779, B:245:0x077e, B:247:0x0782, B:249:0x0786, B:251:0x0790, B:252:0x079a, B:254:0x079e, B:256:0x07a4, B:257:0x07b2, B:258:0x07bb, B:325:0x0a03, B:259:0x07c8, B:261:0x07df, B:267:0x07fb, B:269:0x081f, B:270:0x0827, B:272:0x082d, B:274:0x083f, B:281:0x0868, B:282:0x0888, B:284:0x0894, B:286:0x08a9, B:288:0x08ea, B:292:0x0902, B:294:0x0909, B:296:0x0918, B:298:0x091c, B:300:0x0920, B:302:0x0924, B:303:0x0932, B:305:0x0938, B:307:0x0954, B:308:0x0959, B:324:0x0a00, B:309:0x0974, B:311:0x097c, B:315:0x09a3, B:317:0x09cf, B:318:0x09d6, B:319:0x09e4, B:320:0x09e8, B:322:0x09f2, B:312:0x0989, B:279:0x0853, B:265:0x07e6, B:326:0x0a0f, B:328:0x0a1d, B:329:0x0a23, B:330:0x0a2b, B:332:0x0a31, B:335:0x0a4b, B:337:0x0a5c, B:357:0x0ad0, B:359:0x0ad6, B:361:0x0aee, B:364:0x0af5, B:369:0x0b24, B:371:0x0b66, B:374:0x0b9b, B:375:0x0b9f, B:376:0x0baa, B:378:0x0bed, B:379:0x0bfa, B:381:0x0c09, B:385:0x0c23, B:386:0x0c37, B:388:0x0c3c, B:373:0x0b78, B:365:0x0afd, B:367:0x0b09, B:368:0x0b0d, B:389:0x0c52, B:390:0x0c6a, B:393:0x0c72, B:394:0x0c77, B:395:0x0c87, B:397:0x0ca1, B:398:0x0cbc, B:400:0x0cc6, B:405:0x0ce9, B:404:0x0cd6, B:338:0x0a74, B:340:0x0a7a, B:342:0x0a84, B:344:0x0a8b, B:350:0x0a9b, B:352:0x0aa2, B:354:0x0ac1, B:356:0x0ac8, B:355:0x0ac5, B:351:0x0a9f, B:343:0x0a88, B:202:0x05da, B:204:0x05e0, B:408:0x0cfb), top: B:420:0x000e, inners: #0, #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:434:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0445 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c8  */
    private final boolean zzah(String str, long j10) {
        int i10;
        String str2;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        zzkw zzkwVar;
        Object obj;
        zzem zzemVarZzd;
        String str3;
        Object objZzn;
        long j11;
        int iZzc;
        HashMap map;
        String strZzo;
        zzas zzasVarZza;
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB;
        Long lValueOf;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        int i11;
        String str4;
        com.google.android.gms.internal.measurement.zzgb zzgbVar2;
        com.google.android.gms.internal.measurement.zzfr zzfrVar2;
        int i12;
        com.google.android.gms.internal.measurement.zzfr zzfrVar3;
        int i13;
        int i14;
        com.google.android.gms.internal.measurement.zzgb zzgbVar3;
        int i15;
        com.google.android.gms.internal.measurement.zzfr zzfrVar4;
        int i16;
        int i17;
        com.google.android.gms.internal.measurement.zzfr zzfrVar5;
        ArrayList arrayList;
        int i18;
        int i19;
        int i20;
        String strZzh;
        int iCharCount;
        int iCodePointAt;
        byte b10;
        String str5 = "_npa";
        String str6 = "_ai";
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzw();
        try {
            zzkw zzkwVar2 = new zzkw(this, null);
            zzam zzamVar2 = this.zze;
            zzal(zzamVar2);
            zzamVar2.zzU(null, j10, this.zzA, zzkwVar2);
            List list = zzkwVar2.zzc;
            if (list != null && !list.isEmpty()) {
                com.google.android.gms.internal.measurement.zzgb zzgbVar4 = (com.google.android.gms.internal.measurement.zzgb) zzkwVar2.zza.zzby();
                zzgbVar4.zzr();
                com.google.android.gms.internal.measurement.zzfr zzfrVar6 = null;
                com.google.android.gms.internal.measurement.zzfr zzfrVar7 = null;
                int i21 = 0;
                int i22 = 0;
                int i23 = -1;
                int i24 = -1;
                int i25 = 0;
                while (true) {
                    i10 = i25;
                    str2 = str5;
                    String str7 = str6;
                    if (i21 >= zzkwVar2.zzc.size()) {
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzfr zzfrVar8 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfs) zzkwVar2.zzc.get(i21)).zzby();
                    zzfp zzfpVar = this.zzc;
                    zzal(zzfpVar);
                    int i26 = i22;
                    if (zzfpVar.zzr(zzkwVar2.zza.zzx(), zzfrVar8.zzo())) {
                        zzay().zzk().zzc("Dropping blocked raw event. appId", zzeo.zzn(zzkwVar2.zza.zzx()), this.zzn.zzj().zzd(zzfrVar8.zzo()));
                        zzfp zzfpVar2 = this.zzc;
                        zzal(zzfpVar2);
                        if (!zzfpVar2.zzp(zzkwVar2.zza.zzx())) {
                            zzfp zzfpVar3 = this.zzc;
                            zzal(zzfpVar3);
                            if (!zzfpVar3.zzs(zzkwVar2.zza.zzx()) && !"_err".equals(zzfrVar8.zzo())) {
                                zzv().zzN(this.zzF, zzkwVar2.zza.zzx(), 11, "_ev", zzfrVar8.zzo(), 0);
                            }
                        }
                        i16 = i21;
                        zzfrVar = zzfrVar6;
                        i25 = i10;
                        i22 = i26;
                        zzgbVar3 = zzgbVar4;
                    } else {
                        if (zzfrVar8.zzo().equals(zzgv.zza(str7))) {
                            zzfrVar8.zzi(str7);
                            zzay().zzj().zza("Renaming ad_impression to _ai");
                            if (Log.isLoggable(zzay().zzq(), 5)) {
                                str7 = str7;
                                int i27 = 0;
                                while (i27 < zzfrVar8.zza()) {
                                    int i28 = i21;
                                    if ("ad_platform".equals(zzfrVar8.zzn(i27).zzg()) && !zzfrVar8.zzn(i27).zzh().isEmpty() && AppLovinMediationProvider.ADMOB.equalsIgnoreCase(zzfrVar8.zzn(i27).zzh())) {
                                        zzay().zzl().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i27++;
                                    i21 = i28;
                                }
                            }
                        }
                        str7 = str7;
                        int i29 = i21;
                        zzfp zzfpVar4 = this.zzc;
                        zzal(zzfpVar4);
                        boolean zZzq = zzfpVar4.zzq(zzkwVar2.zza.zzx(), zzfrVar8.zzo());
                        if (zZzq) {
                            zzfrVar = zzfrVar6;
                            i11 = i23;
                        } else {
                            zzal(this.zzi);
                            String strZzo2 = zzfrVar8.zzo();
                            Preconditions.checkNotEmpty(strZzo2);
                            i11 = i23;
                            int iHashCode = strZzo2.hashCode();
                            zzfrVar = zzfrVar6;
                            if (iHashCode != 94660) {
                                if (iHashCode != 95025) {
                                    if (iHashCode == 95027 && strZzo2.equals("_ui")) {
                                        b10 = 1;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (strZzo2.equals("_ug")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (strZzo2.equals("_in")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            if (b10 != 0 && b10 != 1 && b10 != 2) {
                                zzgbVar2 = zzgbVar4;
                                str4 = "_et";
                                zzfrVar2 = zzfrVar7;
                                i12 = i24;
                                zZzq = false;
                            }
                            if (zZzq) {
                                arrayList = new ArrayList(zzfrVar8.zzp());
                                i19 = -1;
                                i20 = -1;
                                for (i18 = 0; i18 < arrayList.size(); i18++) {
                                    if ("value".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i18)).zzg())) {
                                        i19 = i18;
                                    } else if (AppLovinEventParameters.REVENUE_CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i18)).zzg())) {
                                        i20 = i18;
                                    }
                                }
                                if (i19 != -1) {
                                    if (!((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i19)).zzw() || ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i19)).zzu()) {
                                        if (i20 == -1) {
                                            strZzh = ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i20)).zzh();
                                            if (strZzh.length() == 3) {
                                                iCharCount = 0;
                                                while (iCharCount < strZzh.length()) {
                                                    iCodePointAt = strZzh.codePointAt(iCharCount);
                                                    if (Character.isLetter(iCodePointAt)) {
                                                        iCharCount += Character.charCount(iCodePointAt);
                                                    }
                                                }
                                            }
                                        }
                                        zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                        zzfrVar8.zzh(i19);
                                        zzab(zzfrVar8, "_c");
                                        zzaa(zzfrVar8, 19, AppLovinEventParameters.REVENUE_CURRENCY);
                                        break;
                                    }
                                    zzay().zzl().zza("Value must be specified with a numeric type.");
                                    zzfrVar8.zzh(i19);
                                    zzab(zzfrVar8, "_c");
                                    zzaa(zzfrVar8, 18, "value");
                                }
                            }
                            if ("_e".equals(zzfrVar8.zzo())) {
                                zzal(this.zzi);
                                if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), "_fr") == null) {
                                    i14 = i12;
                                    zzgbVar3 = zzgbVar2;
                                    i15 = i11;
                                    i24 = i14;
                                    zzfrVar7 = zzfrVar2;
                                    i23 = i15;
                                } else if (zzfrVar2 != null || Math.abs(zzfrVar2.zzc() - zzfrVar8.zzc()) > 1000) {
                                    zzgbVar3 = zzgbVar2;
                                    zzfrVar = zzfrVar8;
                                    i24 = i12;
                                    zzfrVar7 = zzfrVar2;
                                    i23 = i26;
                                } else {
                                    com.google.android.gms.internal.measurement.zzfr zzfrVar9 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar2.clone();
                                    if (zzaj(zzfrVar8, zzfrVar9)) {
                                        i17 = i12;
                                        zzgbVar3 = zzgbVar2;
                                        zzgbVar3.zzS(i17, zzfrVar9);
                                        i23 = i11;
                                        zzfrVar5 = null;
                                        zzfrVar7 = null;
                                    } else {
                                        i17 = i12;
                                        zzgbVar3 = zzgbVar2;
                                        zzfrVar5 = zzfrVar8;
                                        zzfrVar7 = zzfrVar2;
                                        i23 = i26;
                                    }
                                    zzfrVar = zzfrVar5;
                                    i24 = i17;
                                }
                            } else {
                                i14 = i12;
                                zzgbVar3 = zzgbVar2;
                                if ("_vs".equals(zzfrVar8.zzo())) {
                                    zzal(this.zzi);
                                    if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), str4) != null) {
                                        i15 = i11;
                                        i24 = i14;
                                        zzfrVar7 = zzfrVar2;
                                    } else if (zzfrVar != null || Math.abs(zzfrVar.zzc() - zzfrVar8.zzc()) > 1000) {
                                        zzfrVar7 = zzfrVar8;
                                        i23 = i11;
                                        i24 = i26;
                                    } else {
                                        com.google.android.gms.internal.measurement.zzfr zzfrVar10 = (com.google.android.gms.internal.measurement.zzfr) zzfrVar.clone();
                                        if (zzaj(zzfrVar10, zzfrVar8)) {
                                            i15 = i11;
                                            zzgbVar3.zzS(i15, zzfrVar10);
                                            i24 = i14;
                                            zzfrVar4 = null;
                                            zzfrVar = null;
                                        } else {
                                            i15 = i11;
                                            zzfrVar4 = zzfrVar8;
                                            i24 = i26;
                                        }
                                        zzfrVar7 = zzfrVar4;
                                    }
                                    i23 = i15;
                                } else {
                                    i15 = i11;
                                    i24 = i14;
                                    zzfrVar7 = zzfrVar2;
                                    i23 = i15;
                                }
                            }
                            i16 = i29;
                            zzkwVar2.zzc.set(i16, (com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE());
                            i22 = i26 + 1;
                            zzgbVar3.zzk(zzfrVar8);
                            i25 = i10;
                        }
                        str4 = "_et";
                        int i30 = 0;
                        boolean z10 = false;
                        boolean z11 = false;
                        while (true) {
                            zzgbVar2 = zzgbVar4;
                            if (i30 >= zzfrVar8.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfrVar8.zzn(i30).zzg())) {
                                com.google.android.gms.internal.measurement.zzfv zzfvVar = (com.google.android.gms.internal.measurement.zzfv) zzfrVar8.zzn(i30).zzby();
                                zzfrVar3 = zzfrVar7;
                                i13 = i24;
                                zzfvVar.zzi(1L);
                                zzfrVar8.zzk(i30, (com.google.android.gms.internal.measurement.zzfw) zzfvVar.zzaE());
                                z10 = true;
                            } else {
                                zzfrVar3 = zzfrVar7;
                                i13 = i24;
                                if ("_r".equals(zzfrVar8.zzn(i30).zzg())) {
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar2 = (com.google.android.gms.internal.measurement.zzfv) zzfrVar8.zzn(i30).zzby();
                                    zzfvVar2.zzi(1L);
                                    zzfrVar8.zzk(i30, (com.google.android.gms.internal.measurement.zzfw) zzfvVar2.zzaE());
                                    z11 = true;
                                }
                            }
                            i30++;
                            zzfrVar7 = zzfrVar3;
                            i24 = i13;
                            zzgbVar4 = zzgbVar2;
                        }
                        zzfrVar2 = zzfrVar7;
                        i12 = i24;
                        if (!z10 && zZzq) {
                            zzay().zzj().zzb("Marking event as conversion", this.zzn.zzj().zzd(zzfrVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
                            zzfvVarZze.zzj("_c");
                            zzfvVarZze.zzi(1L);
                            zzfrVar8.zze(zzfvVarZze);
                        }
                        if (!z11) {
                            zzay().zzj().zzb("Marking event as real-time", this.zzn.zzj().zzd(zzfrVar8.zzo()));
                            com.google.android.gms.internal.measurement.zzfv zzfvVarZze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                            zzfvVarZze2.zzj("_r");
                            zzfvVarZze2.zzi(1L);
                            zzfrVar8.zze(zzfvVarZze2);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        if (zzamVar3.zzl(zza(), zzkwVar2.zza.zzx(), false, false, false, false, true).zze > zzg().zze(zzkwVar2.zza.zzx(), zzeb.zzn)) {
                            zzab(zzfrVar8, "_r");
                        } else {
                            i10 = 1;
                        }
                        if (zzlh.zzai(zzfrVar8.zzo()) && zZzq) {
                            zzam zzamVar4 = this.zze;
                            zzal(zzamVar4);
                            if (zzamVar4.zzl(zza(), zzkwVar2.zza.zzx(), false, false, true, false, false).zzc > zzg().zze(zzkwVar2.zza.zzx(), zzeb.zzm)) {
                                zzay().zzk().zzb("Too many conversions. Not logging as conversion. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                                com.google.android.gms.internal.measurement.zzfv zzfvVar3 = null;
                                boolean z12 = false;
                                int i31 = -1;
                                for (int i32 = 0; i32 < zzfrVar8.zza(); i32++) {
                                    com.google.android.gms.internal.measurement.zzfw zzfwVarZzn = zzfrVar8.zzn(i32);
                                    if ("_c".equals(zzfwVarZzn.zzg())) {
                                        zzfvVar3 = (com.google.android.gms.internal.measurement.zzfv) zzfwVarZzn.zzby();
                                        i31 = i32;
                                    } else if ("_err".equals(zzfwVarZzn.zzg())) {
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    if (zzfvVar3 != null) {
                                        zzfrVar8.zzh(i31);
                                    } else {
                                        zzfvVar3 = null;
                                        if (zzfvVar3 != null) {
                                            com.google.android.gms.internal.measurement.zzfv zzfvVar4 = (com.google.android.gms.internal.measurement.zzfv) zzfvVar3.clone();
                                            zzfvVar4.zzj("_err");
                                            zzfvVar4.zzi(10L);
                                            zzfrVar8.zzk(i31, (com.google.android.gms.internal.measurement.zzfw) zzfvVar4.zzaE());
                                        } else {
                                            zzay().zzd().zzb("Did not find conversion parameter. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                                        }
                                    }
                                } else if (zzfvVar3 != null) {
                                    com.google.android.gms.internal.measurement.zzfv zzfvVar5 = (com.google.android.gms.internal.measurement.zzfv) zzfvVar3.clone();
                                    zzfvVar5.zzj("_err");
                                    zzfvVar5.zzi(10L);
                                    zzfrVar8.zzk(i31, (com.google.android.gms.internal.measurement.zzfw) zzfvVar5.zzaE());
                                } else {
                                    zzay().zzd().zzb("Did not find conversion parameter. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                                }
                            }
                        }
                        if (zZzq) {
                            arrayList = new ArrayList(zzfrVar8.zzp());
                            i19 = -1;
                            i20 = -1;
                            while (i18 < arrayList.size()) {
                                if ("value".equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i18)).zzg())) {
                                    i19 = i18;
                                } else if (AppLovinEventParameters.REVENUE_CURRENCY.equals(((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i18)).zzg())) {
                                    i20 = i18;
                                }
                            }
                            if (i19 != -1) {
                                if (((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i19)).zzw()) {
                                }
                                if (i20 == -1) {
                                    strZzh = ((com.google.android.gms.internal.measurement.zzfw) arrayList.get(i20)).zzh();
                                    if (strZzh.length() == 3) {
                                        iCharCount = 0;
                                        while (iCharCount < strZzh.length()) {
                                            iCodePointAt = strZzh.codePointAt(iCharCount);
                                            if (Character.isLetter(iCodePointAt)) {
                                                iCharCount += Character.charCount(iCodePointAt);
                                            }
                                        }
                                    }
                                }
                                zzay().zzl().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                zzfrVar8.zzh(i19);
                                zzab(zzfrVar8, "_c");
                                zzaa(zzfrVar8, 19, AppLovinEventParameters.REVENUE_CURRENCY);
                                break;
                            }
                        }
                        if ("_e".equals(zzfrVar8.zzo())) {
                            zzal(this.zzi);
                            if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), "_fr") == null) {
                                i14 = i12;
                                zzgbVar3 = zzgbVar2;
                                i15 = i11;
                                i24 = i14;
                                zzfrVar7 = zzfrVar2;
                                i23 = i15;
                            } else if (zzfrVar2 != null) {
                                zzgbVar3 = zzgbVar2;
                                zzfrVar = zzfrVar8;
                                i24 = i12;
                                zzfrVar7 = zzfrVar2;
                                i23 = i26;
                            } else {
                                zzgbVar3 = zzgbVar2;
                                zzfrVar = zzfrVar8;
                                i24 = i12;
                                zzfrVar7 = zzfrVar2;
                                i23 = i26;
                            }
                        } else {
                            i14 = i12;
                            zzgbVar3 = zzgbVar2;
                            if ("_vs".equals(zzfrVar8.zzo())) {
                                zzal(this.zzi);
                                if (zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE(), str4) != null) {
                                    if (zzfrVar != null) {
                                    }
                                    zzfrVar7 = zzfrVar8;
                                    i23 = i11;
                                    i24 = i26;
                                } else {
                                    i15 = i11;
                                    i24 = i14;
                                    zzfrVar7 = zzfrVar2;
                                }
                                i23 = i15;
                            } else {
                                i15 = i11;
                                i24 = i14;
                                zzfrVar7 = zzfrVar2;
                                i23 = i15;
                            }
                        }
                        i16 = i29;
                        zzkwVar2.zzc.set(i16, (com.google.android.gms.internal.measurement.zzfs) zzfrVar8.zzaE());
                        i22 = i26 + 1;
                        zzgbVar3.zzk(zzfrVar8);
                        i25 = i10;
                    }
                    i21 = i16 + 1;
                    zzgbVar4 = zzgbVar3;
                    str5 = str2;
                    str6 = str7;
                    zzfrVar6 = zzfrVar;
                }
                com.google.android.gms.internal.measurement.zzgb zzgbVar5 = zzgbVar4;
                long jLongValue = 0;
                int i33 = 0;
                while (i33 < i22) {
                    com.google.android.gms.internal.measurement.zzfs zzfsVarZze = zzgbVar5.zze(i33);
                    if ("_e".equals(zzfsVarZze.zzh())) {
                        zzal(this.zzi);
                        if (zzlb.zzB(zzfsVarZze, "_fr") != null) {
                            zzgbVar5.zzA(i33);
                            i22--;
                            i33--;
                        } else {
                            zzal(this.zzi);
                            zzfwVarZzB = zzlb.zzB(zzfsVarZze, "_et");
                            if (zzfwVarZzB == null) {
                                if (zzfwVarZzB.zzw()) {
                                    lValueOf = Long.valueOf(zzfwVarZzB.zzd());
                                } else {
                                    lValueOf = null;
                                }
                                if (lValueOf == null && lValueOf.longValue() > 0) {
                                    jLongValue += lValueOf.longValue();
                                }
                            }
                        }
                    } else {
                        zzal(this.zzi);
                        zzfwVarZzB = zzlb.zzB(zzfsVarZze, "_et");
                        if (zzfwVarZzB == null) {
                            if (zzfwVarZzB.zzw()) {
                                lValueOf = Long.valueOf(zzfwVarZzB.zzd());
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf == null) {
                            }
                        }
                    }
                    i33++;
                }
                zzaf(zzgbVar5, jLongValue, false);
                Iterator it = zzgbVar5.zzas().iterator();
                while (it.hasNext()) {
                    if ("_s".equals(((com.google.android.gms.internal.measurement.zzfs) it.next()).zzh())) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(zzgbVar5.zzap(), "_se");
                        break;
                    }
                }
                if (zzlb.zza(zzgbVar5, "_sid") >= 0) {
                    zzaf(zzgbVar5, jLongValue, true);
                } else {
                    int iZza = zzlb.zza(zzgbVar5, "_se");
                    if (iZza >= 0) {
                        zzgbVar5.zzB(iZza);
                        zzay().zzd().zzb("Session engagement user property is in the bundle without session ID. appId", zzeo.zzn(zzkwVar2.zza.zzx()));
                    }
                }
                zzlb zzlbVar = this.zzi;
                zzal(zzlbVar);
                zzlbVar.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                zzfp zzfpVar5 = zzlbVar.zzf.zzc;
                zzal(zzfpVar5);
                if (zzfpVar5.zzn(zzgbVar5.zzap())) {
                    zzam zzamVar6 = zzlbVar.zzf.zze;
                    zzal(zzamVar6);
                    zzh zzhVarZzj = zzamVar6.zzj(zzgbVar5.zzap());
                    if (zzhVarZzj != null && zzhVarZzj.zzah() && zzlbVar.zzs.zzg().zze()) {
                        zzlbVar.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                        com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
                        zzgkVarZzd.zzf(str2);
                        zzgkVarZzd.zzg(zzlbVar.zzs.zzg().zza());
                        zzgkVarZzd.zze(1L);
                        com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) zzgkVarZzd.zzaE();
                        int i34 = 0;
                        while (true) {
                            if (i34 >= zzgbVar5.zzb()) {
                                zzgbVar5.zzm(zzglVar);
                                break;
                            }
                            if (str2.equals(zzgbVar5.zzao(i34).zzf())) {
                                zzgbVar5.zzam(i34, zzglVar);
                                break;
                            }
                            i34++;
                        }
                    }
                }
                zzgbVar5.zzai(RecyclerView.FOREVER_NS);
                zzgbVar5.zzQ(Long.MIN_VALUE);
                for (int i35 = 0; i35 < zzgbVar5.zza(); i35++) {
                    com.google.android.gms.internal.measurement.zzfs zzfsVarZze2 = zzgbVar5.zze(i35);
                    if (zzfsVarZze2.zzd() < zzgbVar5.zzd()) {
                        zzgbVar5.zzai(zzfsVarZze2.zzd());
                    }
                    if (zzfsVarZze2.zzd() > zzgbVar5.zzc()) {
                        zzgbVar5.zzQ(zzfsVarZze2.zzd());
                    }
                }
                zzgbVar5.zzz();
                zzgbVar5.zzo();
                zzaa zzaaVar = this.zzh;
                zzal(zzaaVar);
                zzgbVar5.zzf(zzaaVar.zza(zzgbVar5.zzap(), zzgbVar5.zzas(), zzgbVar5.zzat(), Long.valueOf(zzgbVar5.zzd()), Long.valueOf(zzgbVar5.zzc())));
                if (zzg().zzw(zzkwVar2.zza.zzx())) {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    SecureRandom secureRandomZzG = zzv().zzG();
                    int i36 = 0;
                    while (i36 < zzgbVar5.zza()) {
                        com.google.android.gms.internal.measurement.zzfr zzfrVar11 = (com.google.android.gms.internal.measurement.zzfr) zzgbVar5.zze(i36).zzby();
                        if (zzfrVar11.zzo().equals("_ep")) {
                            zzal(this.zzi);
                            String str8 = (String) zzlb.zzC((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE(), "_en");
                            zzas zzasVarZzn = (zzas) map2.get(str8);
                            if (zzasVarZzn == null) {
                                zzam zzamVar7 = this.zze;
                                zzal(zzamVar7);
                                zzasVarZzn = zzamVar7.zzn(zzkwVar2.zza.zzx(), (String) Preconditions.checkNotNull(str8));
                                if (zzasVarZzn != null) {
                                    map2.put(str8, zzasVarZzn);
                                }
                            }
                            if (zzasVarZzn != null && zzasVarZzn.zzi == null) {
                                Long l10 = zzasVarZzn.zzj;
                                if (l10 != null && l10.longValue() > 1) {
                                    zzal(this.zzi);
                                    zzlb.zzz(zzfrVar11, "_sr", zzasVarZzn.zzj);
                                }
                                Boolean bool = zzasVarZzn.zzk;
                                if (bool != null && bool.booleanValue()) {
                                    zzal(this.zzi);
                                    zzlb.zzz(zzfrVar11, "_efs", 1L);
                                }
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                            }
                        } else {
                            zzfp zzfpVar6 = this.zzc;
                            zzal(zzfpVar6);
                            String strZzx = zzkwVar2.zza.zzx();
                            String strZza = zzfpVar6.zza(strZzx, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(strZza)) {
                                j11 = 0;
                            } else {
                                try {
                                    j11 = Long.parseLong(strZza);
                                } catch (NumberFormatException e10) {
                                    zzfpVar6.zzs.zzay().zzk().zzc("Unable to parse timezone offset. appId", zzeo.zzn(strZzx), e10);
                                    j11 = 0;
                                }
                            }
                            long jZzr = zzv().zzr(zzfrVar11.zzc(), j11);
                            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE();
                            Long l11 = 1L;
                            long j12 = j11;
                            if (!TextUtils.isEmpty("_dbg")) {
                                Iterator it2 = zzfsVar.zzi().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfw zzfwVar = (com.google.android.gms.internal.measurement.zzfw) it2.next();
                                        Iterator it3 = it2;
                                        if ("_dbg".equals(zzfwVar.zzg())) {
                                            if (l11.equals(Long.valueOf(zzfwVar.zzd()))) {
                                                iZzc = 1;
                                                break;
                                            }
                                        } else {
                                            it2 = it3;
                                        }
                                    }
                                    zzfp zzfpVar7 = this.zzc;
                                    zzal(zzfpVar7);
                                    iZzc = zzfpVar7.zzc(zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                                    break;
                                }
                            }
                            zzfp zzfpVar8 = this.zzc;
                            zzal(zzfpVar8);
                            iZzc = zzfpVar8.zzc(zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                            break;
                            if (iZzc <= 0) {
                                zzay().zzk().zzc("Sample rate must be positive. event, rate", zzfrVar11.zzo(), Integer.valueOf(iZzc));
                                arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                            } else {
                                zzas zzasVarZza2 = (zzas) map2.get(zzfrVar11.zzo());
                                if (zzasVarZza2 == null) {
                                    zzam zzamVar8 = this.zze;
                                    zzal(zzamVar8);
                                    zzasVarZza2 = zzamVar8.zzn(zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                                    if (zzasVarZza2 == null) {
                                        zzay().zzk().zzc("Event being bundled has no eventAggregate. appId, eventName", zzkwVar2.zza.zzx(), zzfrVar11.zzo());
                                        zzasVarZza2 = new zzas(zzkwVar2.zza.zzx(), zzfrVar11.zzo(), 1L, 1L, 1L, zzfrVar11.zzc(), 0L, null, null, null, null);
                                    }
                                }
                                zzal(this.zzi);
                                Long l12 = (Long) zzlb.zzC((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE(), "_eid");
                                Boolean boolValueOf = Boolean.valueOf(l12 != null);
                                if (iZzc == 1) {
                                    arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                    if (boolValueOf.booleanValue() && (zzasVarZza2.zzi != null || zzasVarZza2.zzj != null || zzasVarZza2.zzk != null)) {
                                        map2.put(zzfrVar11.zzo(), zzasVarZza2.zza(null, null, null));
                                    }
                                } else {
                                    if (secureRandomZzG.nextInt(iZzc) == 0) {
                                        zzal(this.zzi);
                                        Long lValueOf2 = Long.valueOf(iZzc);
                                        zzlb.zzz(zzfrVar11, "_sr", lValueOf2);
                                        arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                        if (boolValueOf.booleanValue()) {
                                            zzasVarZza2 = zzasVarZza2.zza(null, lValueOf2, null);
                                        }
                                        map2.put(zzfrVar11.zzo(), zzasVarZza2.zzb(zzfrVar11.zzc(), jZzr));
                                        zzkwVar2 = zzkwVar2;
                                        map = map2;
                                    } else {
                                        Long l13 = zzasVarZza2.zzh;
                                        if ((l13 != null ? l13.longValue() : zzv().zzr(zzfrVar11.zzb(), j12)) != jZzr) {
                                            zzal(this.zzi);
                                            zzlb.zzz(zzfrVar11, "_efs", 1L);
                                            zzal(this.zzi);
                                            Long lValueOf3 = Long.valueOf(iZzc);
                                            zzlb.zzz(zzfrVar11, "_sr", lValueOf3);
                                            arrayList2.add((com.google.android.gms.internal.measurement.zzfs) zzfrVar11.zzaE());
                                            if (boolValueOf.booleanValue()) {
                                                zzasVarZza2 = zzasVarZza2.zza(null, lValueOf3, Boolean.TRUE);
                                            }
                                            strZzo = zzfrVar11.zzo();
                                            zzasVarZza = zzasVarZza2.zzb(zzfrVar11.zzc(), jZzr);
                                            map = map2;
                                        } else {
                                            map = map2;
                                            if (boolValueOf.booleanValue()) {
                                                strZzo = zzfrVar11.zzo();
                                                zzasVarZza = zzasVarZza2.zza(l12, null, null);
                                            }
                                        }
                                        map.put(strZzo, zzasVarZza);
                                    }
                                    zzgbVar5.zzS(i36, zzfrVar11);
                                }
                                i36++;
                                zzgbVar5 = zzgbVar5;
                                map2 = map;
                                secureRandomZzG = secureRandomZzG;
                                zzkwVar2 = zzkwVar2;
                            }
                        }
                        zzgbVar5.zzS(i36, zzfrVar11);
                        zzkwVar2 = zzkwVar2;
                        secureRandomZzG = secureRandomZzG;
                        zzgbVar5 = zzgbVar5;
                        map = map2;
                        i36++;
                        zzgbVar5 = zzgbVar5;
                        map2 = map;
                        secureRandomZzG = secureRandomZzG;
                        zzkwVar2 = zzkwVar2;
                    }
                    zzkw zzkwVar3 = zzkwVar2;
                    HashMap map3 = map2;
                    zzgbVar = zzgbVar5;
                    if (arrayList2.size() < zzgbVar.zza()) {
                        zzgbVar.zzr();
                        zzgbVar.zzg(arrayList2);
                    }
                    for (Map.Entry entry : map3.entrySet()) {
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzE((zzas) entry.getValue());
                    }
                    zzkwVar = zzkwVar3;
                } else {
                    zzgbVar = zzgbVar5;
                    zzkwVar = zzkwVar2;
                }
                String strZzx2 = zzkwVar.zza.zzx();
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzh zzhVarZzj2 = zzamVar10.zzj(strZzx2);
                if (zzhVarZzj2 == null) {
                    zzay().zzd().zzb("Bundling raw events w/o app info. appId", zzeo.zzn(zzkwVar.zza.zzx()));
                } else if (zzgbVar.zza() > 0) {
                    long jZzn = zzhVarZzj2.zzn();
                    if (jZzn != 0) {
                        zzgbVar.zzab(jZzn);
                    } else {
                        zzgbVar.zzv();
                    }
                    long jZzp = zzhVarZzj2.zzp();
                    if (jZzp != 0) {
                        jZzn = jZzp;
                    }
                    if (jZzn != 0) {
                        zzgbVar.zzac(jZzn);
                    } else {
                        zzgbVar.zzw();
                    }
                    zzhVarZzj2.zzE();
                    zzgbVar.zzI((int) zzhVarZzj2.zzo());
                    zzhVarZzj2.zzab(zzgbVar.zzd());
                    zzhVarZzj2.zzZ(zzgbVar.zzc());
                    String strZzs = zzhVarZzj2.zzs();
                    if (strZzs != null) {
                        zzgbVar.zzW(strZzs);
                    } else {
                        zzgbVar.zzs();
                    }
                    zzam zzamVar11 = this.zze;
                    zzal(zzamVar11);
                    zzamVar11.zzD(zzhVarZzj2);
                }
                if (zzgbVar.zza() > 0) {
                    this.zzn.zzaw();
                    zzfp zzfpVar9 = this.zzc;
                    zzal(zzfpVar9);
                    com.google.android.gms.internal.measurement.zzfe zzfeVarZze = zzfpVar9.zze(zzkwVar.zza.zzx());
                    if (zzfeVarZze != null && zzfeVarZze.zzs()) {
                        zzgbVar.zzK(zzfeVarZze.zzc());
                    } else if (zzkwVar.zza.zzF().isEmpty()) {
                        zzgbVar.zzK(-1L);
                    } else {
                        zzay().zzk().zzb("Did not find measurement config or missing version info. appId", zzeo.zzn(zzkwVar.zza.zzx()));
                    }
                    zzam zzamVar12 = this.zze;
                    zzal(zzamVar12);
                    com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE();
                    zzamVar12.zzg();
                    zzamVar12.zzW();
                    Preconditions.checkNotNull(zzgcVar);
                    Preconditions.checkNotEmpty(zzgcVar.zzx());
                    Preconditions.checkState(zzgcVar.zzbe());
                    zzamVar12.zzz();
                    long jCurrentTimeMillis = zzamVar12.zzs.zzav().currentTimeMillis();
                    long jZzk = zzgcVar.zzk();
                    zzamVar12.zzs.zzf();
                    if (jZzk >= jCurrentTimeMillis - zzag.zzA()) {
                        long jZzk2 = zzgcVar.zzk();
                        zzamVar12.zzs.zzf();
                        if (jZzk2 > zzag.zzA() + jCurrentTimeMillis) {
                            zzamVar12.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeo.zzn(zzgcVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgcVar.zzk()));
                        }
                    } else {
                        zzamVar12.zzs.zzay().zzk().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzeo.zzn(zzgcVar.zzx()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzgcVar.zzk()));
                    }
                    byte[] bArrZzbv = zzgcVar.zzbv();
                    try {
                        zzlb zzlbVar2 = zzamVar12.zzf.zzi;
                        zzal(zzlbVar2);
                        byte[] bArrZzy = zzlbVar2.zzy(bArrZzbv);
                        zzamVar12.zzs.zzay().zzj().zzb("Saving bundle, size", Integer.valueOf(bArrZzy.length));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", zzgcVar.zzx());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgcVar.zzk()));
                        contentValues.put("data", bArrZzy);
                        contentValues.put("has_realtime", Integer.valueOf(i10));
                        if (zzgcVar.zzbk()) {
                            contentValues.put("retry_count", Integer.valueOf(zzgcVar.zze()));
                        }
                        try {
                            if (zzamVar12.zzh().insert("queue", null, contentValues) == -1) {
                                zzamVar12.zzs.zzay().zzd().zzb("Failed to insert bundle (got -1). appId", zzeo.zzn(zzgcVar.zzx()));
                            }
                        } catch (SQLiteException e11) {
                            obj = e11;
                            zzemVarZzd = zzamVar12.zzs.zzay().zzd();
                            str3 = "Error storing bundle. appId";
                            objZzn = zzeo.zzn(zzgcVar.zzx());
                            zzemVarZzd.zzc(str3, objZzn, obj);
                        }
                    } catch (IOException e12) {
                        obj = e12;
                        zzemVarZzd = zzamVar12.zzs.zzay().zzd();
                        str3 = "Data loss. Failed to serialize bundle. appId";
                        objZzn = zzeo.zzn(zzgcVar.zzx());
                    }
                }
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                List list2 = zzkwVar.zzb;
                Preconditions.checkNotNull(list2);
                zzamVar13.zzg();
                zzamVar13.zzW();
                StringBuilder sb2 = new StringBuilder("rowid in (");
                for (int i37 = 0; i37 < list2.size(); i37++) {
                    if (i37 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(((Long) list2.get(i37)).longValue());
                }
                sb2.append(")");
                int iDelete = zzamVar13.zzh().delete("raw_events", sb2.toString(), null);
                if (iDelete != list2.size()) {
                    zzamVar13.zzs.zzay().zzd().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list2.size()));
                }
                zzam zzamVar14 = this.zze;
                zzal(zzamVar14);
                try {
                    zzamVar14.zzh().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strZzx2, strZzx2});
                } catch (SQLiteException e13) {
                    zzamVar14.zzs.zzay().zzd().zzc("Failed to remove unused event metadata. appId", zzeo.zzn(strZzx2), e13);
                }
                zzam zzamVar15 = this.zze;
                zzal(zzamVar15);
                zzamVar15.zzC();
                zzam zzamVar16 = this.zze;
                zzal(zzamVar16);
                zzamVar16.zzx();
                return true;
            }
            zzam zzamVar17 = this.zze;
            zzal(zzamVar17);
            zzamVar17.zzC();
            zzam zzamVar18 = this.zze;
            zzal(zzamVar18);
            zzamVar18.zzx();
            return false;
        } catch (Throwable th) {
            zzam zzamVar19 = this.zze;
            zzal(zzamVar19);
            zzamVar19.zzx();
            throw th;
        }
    }

    private final boolean zzai() {
        zzaz().zzg();
        zzB();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        if (zzamVar.zzF()) {
            return true;
        }
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        return !TextUtils.isEmpty(zzamVar2.zzr());
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfr zzfrVar, com.google.android.gms.internal.measurement.zzfr zzfrVar2) {
        Preconditions.checkArgument("_e".equals(zzfrVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE(), "_sc");
        String strZzh = zzfwVarZzB == null ? null : zzfwVarZzB.zzh();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB2 = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzaE(), "_pc");
        String strZzh2 = zzfwVarZzB2 != null ? zzfwVarZzB2.zzh() : null;
        if (strZzh2 == null || !strZzh2.equals(strZzh)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzfrVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB3 = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE(), "_et");
        if (zzfwVarZzB3 == null || !zzfwVarZzB3.zzw() || zzfwVarZzB3.zzd() <= 0) {
            return true;
        }
        long jZzd = zzfwVarZzB3.zzd();
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfw zzfwVarZzB4 = zzlb.zzB((com.google.android.gms.internal.measurement.zzfs) zzfrVar2.zzaE(), "_et");
        if (zzfwVarZzB4 != null && zzfwVarZzB4.zzd() > 0) {
            jZzd += zzfwVarZzB4.zzd();
        }
        zzal(this.zzi);
        zzlb.zzz(zzfrVar2, "_et", Long.valueOf(jZzd));
        zzal(this.zzi);
        zzlb.zzz(zzfrVar, "_fr", 1L);
        return true;
    }

    private static final boolean zzak(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    private static final zzkn zzal(zzkn zzknVar) {
        if (zzknVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzknVar.zzY()) {
            return zzknVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzknVar.getClass())));
    }

    public static zzkz zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkz.class) {
                if (zzb == null) {
                    zzb = new zzkz((zzla) Preconditions.checkNotNull(new zzla(context)), null);
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzkz zzkzVar, zzla zzlaVar) {
        zzkzVar.zzaz().zzg();
        zzkzVar.zzm = new zzfg(zzkzVar);
        zzam zzamVar = new zzam(zzkzVar);
        zzamVar.zzX();
        zzkzVar.zze = zzamVar;
        zzkzVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzkzVar.zzc));
        zzju zzjuVar = new zzju(zzkzVar);
        zzjuVar.zzX();
        zzkzVar.zzk = zzjuVar;
        zzaa zzaaVar = new zzaa(zzkzVar);
        zzaaVar.zzX();
        zzkzVar.zzh = zzaaVar;
        zzii zziiVar = new zzii(zzkzVar);
        zziiVar.zzX();
        zzkzVar.zzj = zziiVar;
        zzkl zzklVar = new zzkl(zzkzVar);
        zzklVar.zzX();
        zzkzVar.zzg = zzklVar;
        zzkzVar.zzf = new zzew(zzkzVar);
        if (zzkzVar.zzr != zzkzVar.zzs) {
            zzkzVar.zzay().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzkzVar.zzr), Integer.valueOf(zzkzVar.zzs));
        }
        zzkzVar.zzo = true;
    }

    @VisibleForTesting
    public final void zzA() {
        zzem zzemVarZzd;
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        zzaz().zzg();
        zzB();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzZ()) {
            FileChannel fileChannel = this.zzx;
            zzaz().zzg();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzay().zzd().zza("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i11 = fileChannel.read(byteBufferAllocate);
                    if (i11 == 4) {
                        byteBufferAllocate.flip();
                        i10 = byteBufferAllocate.getInt();
                    } else if (i11 != -1) {
                        zzay().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(i11));
                    }
                } catch (IOException e10) {
                    zzay().zzd().zzb("Failed to read from channel", e10);
                }
            }
            int iZzi = this.zzn.zzh().zzi();
            zzaz().zzg();
            if (i10 > iZzi) {
                zzemVarZzd = zzay().zzd();
                numValueOf = Integer.valueOf(i10);
                numValueOf2 = Integer.valueOf(iZzi);
                str = "Panic: can't downgrade version. Previous, current version";
            } else {
                if (i10 >= iZzi) {
                    return;
                }
                FileChannel fileChannel2 = this.zzx;
                zzaz().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzay().zzd().zza("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iZzi);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzay().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzemVarZzd = zzay().zzj();
                        numValueOf = Integer.valueOf(i10);
                        numValueOf2 = Integer.valueOf(iZzi);
                        str = "Storage version upgraded. Previous, current version";
                    } catch (IOException e11) {
                        zzay().zzd().zzb("Failed to write to channel", e11);
                        zzemVarZzd = zzay().zzd();
                        numValueOf = Integer.valueOf(i10);
                        numValueOf2 = Integer.valueOf(iZzi);
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                zzemVarZzd = zzay().zzd();
                numValueOf = Integer.valueOf(i10);
                numValueOf2 = Integer.valueOf(iZzi);
                str = "Storage version upgrade failed. Previous, current version";
            }
            zzemVarZzd.zzc(str, numValueOf, numValueOf2);
        }
    }

    public final void zzB() {
        if (!this.zzo) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    public final void zzC(String str, com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        int iZza;
        int iIndexOf;
        zzow.zzc();
        if (zzg().zzs(str, zzeb.zzam)) {
            zzfp zzfpVar = this.zzc;
            zzal(zzfpVar);
            Set setZzk = zzfpVar.zzk(str);
            if (setZzk != null) {
                zzgbVar.zzi(setZzk);
            }
        }
        if (zzg().zzs(str, zzeb.zzao)) {
            zzfp zzfpVar2 = this.zzc;
            zzal(zzfpVar2);
            if (zzfpVar2.zzv(str)) {
                zzgbVar.zzp();
            }
            zzfp zzfpVar3 = this.zzc;
            zzal(zzfpVar3);
            if (zzfpVar3.zzy(str)) {
                if (zzg().zzs(str, zzeb.zzay)) {
                    String strZzar = zzgbVar.zzar();
                    if (!TextUtils.isEmpty(strZzar) && (iIndexOf = strZzar.indexOf(".")) != -1) {
                        zzgbVar.zzY(strZzar.substring(0, iIndexOf));
                    }
                } else {
                    zzgbVar.zzu();
                }
            }
        }
        if (zzg().zzs(str, zzeb.zzap)) {
            zzfp zzfpVar4 = this.zzc;
            zzal(zzfpVar4);
            if (zzfpVar4.zzz(str) && (iZza = zzlb.zza(zzgbVar, "_id")) != -1) {
                zzgbVar.zzB(iZza);
            }
        }
        if (zzg().zzs(str, zzeb.zzaq)) {
            zzfp zzfpVar5 = this.zzc;
            zzal(zzfpVar5);
            if (zzfpVar5.zzx(str)) {
                zzgbVar.zzq();
            }
        }
        if (zzg().zzs(str, zzeb.zzat)) {
            zzfp zzfpVar6 = this.zzc;
            zzal(zzfpVar6);
            if (zzfpVar6.zzu(str)) {
                zzgbVar.zzn();
                if (zzg().zzs(str, zzeb.zzau)) {
                    zzky zzkyVar = (zzky) this.zzC.get(str);
                    if (zzkyVar == null) {
                        zzkyVar = new zzky(this);
                        this.zzC.put(str, zzkyVar);
                    } else if (zzg().zzi(str, zzeb.zzR) + zzkyVar.zzb < zzav().elapsedRealtime()) {
                        zzkyVar = new zzky(this);
                        this.zzC.put(str, zzkyVar);
                    }
                    zzgbVar.zzR(zzkyVar.zza);
                }
            }
        }
        if (zzg().zzs(str, zzeb.zzav)) {
            zzfp zzfpVar7 = this.zzc;
            zzal(zzfpVar7);
            if (zzfpVar7.zzw(str)) {
                zzgbVar.zzy();
            }
        }
    }

    public final void zzD(zzh zzhVar) {
        q.a aVar;
        q.a aVar2;
        zzaz().zzg();
        if (TextUtils.isEmpty(zzhVar.zzy()) && TextUtils.isEmpty(zzhVar.zzr())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzt()), 204, null, null, null);
            return;
        }
        zzko zzkoVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String strZzy = zzhVar.zzy();
        if (TextUtils.isEmpty(strZzy)) {
            strZzy = zzhVar.zzr();
        }
        q.a aVar3 = null;
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) zzeb.zzd.zza(null)).encodedAuthority((String) zzeb.zze.zza(null)).path("config/app/".concat(String.valueOf(strZzy))).appendQueryParameter("platform", "android");
        zzkoVar.zzs.zzf().zzh();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(73000L)).appendQueryParameter("runtime_version", "0");
        zzow.zzc();
        if (!zzkoVar.zzs.zzf().zzs(zzhVar.zzt(), zzeb.zzak)) {
            builder.appendQueryParameter("app_instance_id", zzhVar.zzu());
        }
        String string = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzt());
            URL url = new URL(string);
            zzay().zzj().zzb("Fetching remote configuration", str);
            zzfp zzfpVar = this.zzc;
            zzal(zzfpVar);
            com.google.android.gms.internal.measurement.zzfe zzfeVarZze = zzfpVar.zze(str);
            zzfp zzfpVar2 = this.zzc;
            zzal(zzfpVar2);
            String strZzh = zzfpVar2.zzh(str);
            if (zzfeVarZze == null) {
                aVar = aVar3;
            } else {
                if (TextUtils.isEmpty(strZzh)) {
                    aVar2 = null;
                } else {
                    aVar2 = new q.a();
                    aVar2.put("If-Modified-Since", strZzh);
                }
                zzow.zzc();
                if (zzg().zzs(null, zzeb.zzaw)) {
                    zzfp zzfpVar3 = this.zzc;
                    zzal(zzfpVar3);
                    String strZzf = zzfpVar3.zzf(str);
                    if (!TextUtils.isEmpty(strZzf)) {
                        if (aVar2 == null) {
                            aVar2 = new q.a();
                        }
                        aVar3 = aVar2;
                        aVar3.put("If-None-Match", strZzf);
                        aVar = aVar3;
                    }
                }
                aVar = aVar2;
            }
            this.zzt = true;
            zzeu zzeuVar = this.zzd;
            zzal(zzeuVar);
            zzkr zzkrVar = new zzkr(this);
            zzeuVar.zzg();
            zzeuVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkrVar);
            zzeuVar.zzs.zzaz().zzo(new zzet(zzeuVar, str, url, null, aVar, zzkrVar));
        } catch (MalformedURLException unused) {
            zzay().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzeo.zzn(zzhVar.zzt()), string);
        }
    }

    public final void zzE(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> listZzt;
        List<zzac> listZzt2;
        List<zzac> listZzt3;
        zzem zzemVarZzd;
        String str;
        Object objZzn;
        String strZzf;
        Object obj;
        String str2;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaz().zzg();
        zzB();
        String str3 = zzqVar.zza;
        long j10 = zzawVar.zzd;
        zzep zzepVarZzb = zzep.zzb(zzawVar);
        zzaz().zzg();
        zzik zzikVar = null;
        if (this.zzD != null && (str2 = this.zzE) != null && str2.equals(str3)) {
            zzikVar = this.zzD;
        }
        zzlh.zzK(zzikVar, zzepVarZzb.zzd, false);
        zzaw zzawVarZza = zzepVarZzb.zza();
        zzal(this.zzi);
        if (zzlb.zzA(zzawVarZza, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            List list = zzqVar.zzt;
            if (list == null) {
                zzawVar2 = zzawVarZza;
            } else if (!list.contains(zzawVarZza.zza)) {
                zzay().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str3, zzawVarZza.zza, zzawVarZza.zzc);
                return;
            } else {
                Bundle bundleZzc = zzawVarZza.zzb.zzc();
                bundleZzc.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zzawVarZza.zza, new zzau(bundleZzc), zzawVarZza.zzc, zzawVarZza.zzd);
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                Preconditions.checkNotEmpty(str3);
                zzamVar2.zzg();
                zzamVar2.zzW();
                if (j10 < 0) {
                    zzamVar2.zzs.zzay().zzk().zzc("Invalid time querying timed out conditional properties", zzeo.zzn(str3), Long.valueOf(j10));
                    listZzt = Collections.emptyList();
                } else {
                    listZzt = zzamVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j10)});
                }
                for (zzac zzacVar : listZzt) {
                    if (zzacVar != null) {
                        zzay().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                        zzaw zzawVar3 = zzacVar.zzg;
                        if (zzawVar3 != null) {
                            zzY(new zzaw(zzawVar3, j10), zzqVar);
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zza(str3, zzacVar.zzc.zzb);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                Preconditions.checkNotEmpty(str3);
                zzamVar4.zzg();
                zzamVar4.zzW();
                if (j10 < 0) {
                    zzamVar4.zzs.zzay().zzk().zzc("Invalid time querying expired conditional properties", zzeo.zzn(str3), Long.valueOf(j10));
                    listZzt2 = Collections.emptyList();
                } else {
                    listZzt2 = zzamVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(listZzt2.size());
                for (zzac zzacVar2 : listZzt2) {
                    if (zzacVar2 != null) {
                        zzay().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzA(str3, zzacVar2.zzc.zzb);
                        zzaw zzawVar4 = zzacVar2.zzk;
                        if (zzawVar4 != null) {
                            arrayList.add(zzawVar4);
                        }
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zza(str3, zzacVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzY(new zzaw((zzaw) it.next(), j10), zzqVar);
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                String str4 = zzawVar2.zza;
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotEmpty(str4);
                zzamVar7.zzg();
                zzamVar7.zzW();
                if (j10 < 0) {
                    zzamVar7.zzs.zzay().zzk().zzd("Invalid time querying triggered conditional properties", zzeo.zzn(str3), zzamVar7.zzs.zzj().zzd(str4), Long.valueOf(j10));
                    listZzt3 = Collections.emptyList();
                } else {
                    listZzt3 = zzamVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(listZzt3.size());
                for (zzac zzacVar3 : listZzt3) {
                    if (zzacVar3 != null) {
                        zzlc zzlcVar = zzacVar3.zzc;
                        zzle zzleVar = new zzle((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzlcVar.zzb, j10, Preconditions.checkNotNull(zzlcVar.zza()));
                        zzam zzamVar8 = this.zze;
                        zzal(zzamVar8);
                        if (zzamVar8.zzL(zzleVar)) {
                            zzemVarZzd = zzay().zzj();
                            str = "User property triggered";
                            objZzn = zzacVar3.zza;
                            strZzf = this.zzn.zzj().zzf(zzleVar.zzc);
                            obj = zzleVar.zze;
                        } else {
                            zzemVarZzd = zzay().zzd();
                            str = "Too many active user properties, ignoring";
                            objZzn = zzeo.zzn(zzacVar3.zza);
                            strZzf = this.zzn.zzj().zzf(zzleVar.zzc);
                            obj = zzleVar.zze;
                        }
                        zzemVarZzd.zzd(str, objZzn, strZzf, obj);
                        zzaw zzawVar5 = zzacVar3.zzi;
                        if (zzawVar5 != null) {
                            arrayList2.add(zzawVar5);
                        }
                        zzacVar3.zzc = new zzlc(zzleVar);
                        zzacVar3.zze = true;
                        zzam zzamVar9 = this.zze;
                        zzal(zzamVar9);
                        zzamVar9.zzK(zzacVar3);
                    }
                }
                zzY(zzawVar2, zzqVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzY(new zzaw((zzaw) it2.next(), j10), zzqVar);
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzC();
            } finally {
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzx();
            }
        }
    }

    public final void zzF(zzaw zzawVar, String str) {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(str);
        if (zzhVarZzj == null || TextUtils.isEmpty(zzhVarZzj.zzw())) {
            zzay().zzc().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean boolZzad = zzad(zzhVarZzj);
        if (boolZzad == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                zzay().zzk().zzb("Could not find package. appId", zzeo.zzn(str));
            }
        } else if (!boolZzad.booleanValue()) {
            zzay().zzd().zzb("App version does not match; dropping event. appId", zzeo.zzn(str));
            return;
        }
        String strZzy = zzhVarZzj.zzy();
        String strZzw = zzhVarZzj.zzw();
        long jZzb = zzhVarZzj.zzb();
        String strZzv = zzhVarZzj.zzv();
        long jZzm = zzhVarZzj.zzm();
        long jZzj = zzhVarZzj.zzj();
        boolean zZzai = zzhVarZzj.zzai();
        String strZzx = zzhVarZzj.zzx();
        zzhVarZzj.zza();
        zzG(zzawVar, new zzq(str, strZzy, strZzw, jZzb, strZzv, jZzm, jZzj, (String) null, zZzai, false, strZzx, 0L, 0L, 0, zzhVarZzj.zzah(), false, zzhVarZzj.zzr(), zzhVarZzj.zzq(), zzhVarZzj.zzk(), zzhVarZzj.zzC(), (String) null, zzh(str).zzh(), "", (String) null));
    }

    public final void zzG(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzep zzepVarZzb = zzep.zzb(zzawVar);
        zzlh zzlhVarZzv = zzv();
        Bundle bundle = zzepVarZzb.zzd;
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzlhVarZzv.zzL(bundle, zzamVar.zzi(zzqVar.zza));
        zzv().zzM(zzepVarZzb, zzg().zzd(zzqVar.zza));
        zzaw zzawVarZza = zzepVarZzb.zza();
        if ("_cmp".equals(zzawVarZza.zza) && "referrer API v2".equals(zzawVarZza.zzb.zzg("_cis"))) {
            String strZzg = zzawVarZza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(strZzg)) {
                zzW(new zzlc("_lgclid", zzawVarZza.zzd, strZzg, "auto"), zzqVar);
            }
        }
        zzE(zzawVarZza, zzqVar);
    }

    public final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[PHI: r10
  0x0046: PHI (r10v11 int) = (r10v2 int), (r10v0 int) binds: [B:12:0x0042, B:10:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:6:0x002c, B:16:0x0049, B:70:0x0184, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:61:0x013c, B:63:0x0151, B:65:0x0170, B:67:0x017b, B:69:0x0181, B:64:0x015f, B:55:0x0120, B:57:0x012b), top: B:78:0x002c, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x015f A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:6:0x002c, B:16:0x0049, B:70:0x0184, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:36:0x00d7, B:39:0x00e8, B:42:0x00f4, B:44:0x00fa, B:49:0x0107, B:61:0x013c, B:63:0x0151, B:65:0x0170, B:67:0x017b, B:69:0x0181, B:64:0x015f, B:55:0x0120, B:57:0x012b), top: B:78:0x002c, outer: #1 }] */
    @VisibleForTesting
    public final void zzI(String str, int i10, Throwable th, byte[] bArr, Map map) {
        boolean z10;
        String str2;
        zzam zzamVar;
        zzeu zzeuVar;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzt = false;
                zzae();
                throw th2;
            }
        }
        zzem zzemVarZzj = zzay().zzj();
        Integer numValueOf = Integer.valueOf(bArr.length);
        zzemVarZzj.zzb("onConfigFetched. Response size", numValueOf);
        zzam zzamVar2 = this.zze;
        zzal(zzamVar2);
        zzamVar2.zzw();
        try {
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzh zzhVarZzj = zzamVar3.zzj(str);
            if (i10 == 200 || i10 == 204) {
                if (th == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (i10 == 304) {
                i10 = 304;
                if (th == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (zzhVarZzj == null) {
                zzay().zzk().zzb("App does not exist in onConfigFetched. appId", zzeo.zzn(str));
            } else {
                if (z10 || i10 == 404) {
                    List list = map != null ? (List) map.get("Last-Modified") : null;
                    String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                    zzow.zzc();
                    if (zzg().zzs(null, zzeb.zzaw)) {
                        List list2 = map != null ? (List) map.get("ETag") : null;
                        if (list2 == null || list2.isEmpty()) {
                            str2 = null;
                        } else {
                            str2 = (String) list2.get(0);
                        }
                    } else {
                        str2 = null;
                    }
                    if (i10 == 404 || i10 == 304) {
                        zzfp zzfpVar = this.zzc;
                        zzal(zzfpVar);
                        if (zzfpVar.zze(str) == null) {
                            zzfp zzfpVar2 = this.zzc;
                            zzal(zzfpVar2);
                            if (!zzfpVar2.zzt(str, null, null, null)) {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                            }
                        }
                        zzhVarZzj.zzL(zzav().currentTimeMillis());
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzD(zzhVarZzj);
                        if (i10 == 404) {
                            zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), numValueOf);
                        }
                        zzeuVar = this.zzd;
                        zzal(zzeuVar);
                        if (!zzeuVar.zza() && zzai()) {
                            zzX();
                        }
                    } else {
                        zzfp zzfpVar3 = this.zzc;
                        zzal(zzfpVar3);
                        if (zzfpVar3.zzt(str, bArr, str3, str2)) {
                            zzhVarZzj.zzL(zzav().currentTimeMillis());
                            zzam zzamVar5 = this.zze;
                            zzal(zzamVar5);
                            zzamVar5.zzD(zzhVarZzj);
                            if (i10 == 404) {
                                zzay().zzl().zzb("Config not found. Using empty config. appId", str);
                            } else {
                                zzay().zzj().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i10), numValueOf);
                            }
                            zzeuVar = this.zzd;
                            zzal(zzeuVar);
                            if (!zzeuVar.zza()) {
                            }
                        } else {
                            zzamVar = this.zze;
                            zzal(zzamVar);
                        }
                    }
                    zzamVar.zzx();
                    this.zzt = false;
                    zzae();
                }
                zzhVarZzj.zzU(zzav().currentTimeMillis());
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzD(zzhVarZzj);
                zzay().zzj().zzc("Fetching config failed. code, error", Integer.valueOf(i10), th);
                zzfp zzfpVar4 = this.zzc;
                zzal(zzfpVar4);
                zzfpVar4.zzl(str);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i10 == 503 || i10 == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzag();
            }
            zzam zzamVar7 = this.zze;
            zzal(zzamVar7);
            zzamVar7.zzC();
            zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzx();
            this.zzt = false;
            zzae();
        } catch (Throwable th3) {
            zzam zzamVar8 = this.zze;
            zzal(zzamVar8);
            zzamVar8.zzx();
            throw th3;
        }
    }

    public final void zzJ(boolean z10) {
        zzag();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #2 {all -> 0x00ec, blocks: (B:12:0x005e, B:13:0x0062, B:15:0x0068, B:16:0x006e, B:17:0x008a, B:20:0x0095, B:21:0x009c, B:23:0x009e, B:24:0x00ad, B:26:0x00af, B:28:0x00b3, B:31:0x00ba, B:32:0x00bb), top: B:58:0x005e, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2 A[Catch: SQLiteException -> 0x00f6, all -> 0x016a, TryCatch #0 {SQLiteException -> 0x00f6, blocks: (B:11:0x0025, B:33:0x00c3, B:35:0x00d8, B:37:0x00de, B:39:0x00e9, B:38:0x00e2, B:41:0x00ed, B:42:0x00f5), top: B:56:0x0025, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0122 A[Catch: all -> 0x016a, PHI: r9
  0x0122: PHI (r9v18 int) = (r9v2 int), (r9v0 int) binds: [B:10:0x0023, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x016a, blocks: (B:4:0x000d, B:5:0x000f, B:45:0x0122, B:50:0x0159, B:49:0x014a, B:11:0x0025, B:33:0x00c3, B:35:0x00d8, B:37:0x00de, B:39:0x00e9, B:38:0x00e2, B:41:0x00ed, B:42:0x00f5, B:44:0x00f7), top: B:57:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a A[Catch: all -> 0x016a, TryCatch #1 {all -> 0x016a, blocks: (B:4:0x000d, B:5:0x000f, B:45:0x0122, B:50:0x0159, B:49:0x014a, B:11:0x0025, B:33:0x00c3, B:35:0x00d8, B:37:0x00de, B:39:0x00e9, B:38:0x00e2, B:41:0x00ed, B:42:0x00f5, B:44:0x00f7), top: B:57:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0094 A[SYNTHETIC] */
    @VisibleForTesting
    public final void zzK(int i10, Throwable th, byte[] bArr, String str) {
        zzeu zzeuVar;
        zzam zzamVar;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzae();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i10 == 200) {
            if (th == null) {
                try {
                    this.zzk.zzc.zzb(zzav().currentTimeMillis());
                    this.zzk.zzd.zzb(0L);
                    zzag();
                    zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzw();
                    try {
                        for (Long l10 : list) {
                            try {
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                jLongValue = l10.longValue();
                                zzamVar.zzg();
                                zzamVar.zzW();
                                try {
                                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                                    }
                                } catch (SQLiteException e10) {
                                    zzamVar.zzs.zzay().zzd().zzb("Failed to delete a bundle in a queue table", e10);
                                    throw e10;
                                }
                            } catch (SQLiteException e11) {
                                List list2 = this.zzz;
                                if (list2 == null || !list2.contains(l10)) {
                                    throw e11;
                                }
                            }
                        }
                        zzam zzamVar3 = this.zze;
                        zzal(zzamVar3);
                        zzamVar3.zzC();
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzx();
                        this.zzz = null;
                        zzeuVar = this.zzd;
                        zzal(zzeuVar);
                        if (zzeuVar.zza() || !zzai()) {
                            this.zzA = -1L;
                            zzag();
                        } else {
                            zzX();
                        }
                        this.zza = 0L;
                    } catch (Throwable th3) {
                        zzam zzamVar5 = this.zze;
                        zzal(zzamVar5);
                        zzamVar5.zzx();
                        throw th3;
                    }
                } catch (SQLiteException e12) {
                    zzay().zzd().zzb("Database error while trying to delete uploaded bundles", e12);
                    this.zza = zzav().elapsedRealtime();
                    zzay().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
                }
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i10 != 503 || i10 == 429) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzy(list);
                zzag();
            }
        } else if (i10 == 204) {
            i10 = 204;
            if (th == null) {
                this.zzk.zzc.zzb(zzav().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzay().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i10), Integer.valueOf(bArr.length));
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzamVar7.zzw();
                while (r9.hasNext()) {
                    zzamVar = this.zze;
                    zzal(zzamVar);
                    jLongValue = l10.longValue();
                    zzamVar.zzg();
                    zzamVar.zzW();
                    if (zzamVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(jLongValue)}) == 1) {
                        throw new SQLiteException("Deleted fewer rows from queue than expected");
                    }
                }
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
                this.zzz = null;
                zzeuVar = this.zzd;
                zzal(zzeuVar);
                if (zzeuVar.zza()) {
                    this.zzA = -1L;
                    zzag();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } else {
                zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
                this.zzk.zzd.zzb(zzav().currentTimeMillis());
                if (i10 != 503) {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                } else {
                    this.zzk.zzb.zzb(zzav().currentTimeMillis());
                }
                zzam zzamVar10 = this.zze;
                zzal(zzamVar10);
                zzamVar10.zzy(list);
                zzag();
            }
        } else {
            zzay().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i10), th);
            this.zzk.zzd.zzb(zzav().currentTimeMillis());
            if (i10 != 503) {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            } else {
                this.zzk.zzb.zzb(zzav().currentTimeMillis());
            }
            zzam zzamVar11 = this.zze;
            zzal(zzamVar11);
            zzamVar11.zzy(list);
            zzag();
        }
        this.zzu = false;
        zzae();
    }

    /* JADX WARN: Code duplicated, block: B:127:0x03e0 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x040c A[Catch: all -> 0x056f, TRY_LEAVE, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0446 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x044e A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0456 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0463  */
    /* JADX WARN: Code duplicated, block: B:145:0x0469 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0474 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x047a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0483  */
    /* JADX WARN: Code duplicated, block: B:152:0x0486  */
    /* JADX WARN: Code duplicated, block: B:155:0x0498  */
    /* JADX WARN: Code duplicated, block: B:166:0x04c7 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04cd A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x04d8 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x04e3 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a4, B:25:0x00b3, B:43:0x0119, B:45:0x012c, B:47:0x0142, B:48:0x0169, B:50:0x01c5, B:52:0x01cb, B:54:0x01d4, B:64:0x0206, B:66:0x0211, B:70:0x021e, B:73:0x022f, B:77:0x023a, B:79:0x023d, B:80:0x025b, B:82:0x0260, B:85:0x027f, B:88:0x0292, B:90:0x02b8, B:93:0x02c0, B:95:0x02cf, B:96:0x02db, B:125:0x03ac, B:127:0x03e0, B:128:0x03e3, B:130:0x040c, B:174:0x04e3, B:175:0x04e6, B:184:0x055e, B:132:0x0421, B:137:0x0446, B:139:0x044e, B:141:0x0456, B:145:0x0469, B:149:0x047c, B:153:0x0488, B:156:0x049c, B:158:0x04a9, B:166:0x04c7, B:168:0x04cd, B:169:0x04d2, B:171:0x04d8, B:164:0x04b3, B:147:0x0474, B:135:0x0432, B:97:0x02e0, B:99:0x030b, B:100:0x0318, B:102:0x031f, B:104:0x0325, B:106:0x032f, B:108:0x0335, B:110:0x033b, B:112:0x0341, B:113:0x0346, B:118:0x0369, B:121:0x036e, B:122:0x0382, B:123:0x0390, B:124:0x039e, B:176:0x04fb, B:178:0x052b, B:179:0x052e, B:180:0x053f, B:181:0x0543, B:183:0x0547, B:83:0x026f, B:60:0x01ed, B:29:0x00c5, B:31:0x00c9, B:35:0x00da, B:37:0x00f3, B:39:0x00fd, B:42:0x0109), top: B:203:0x00a4, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0421 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void zzL(zzq zzqVar) {
        String str;
        String str2;
        int i10;
        String str3;
        zzas zzasVarZzn;
        boolean z10;
        zzaw zzawVar;
        zzem zzemVarZzm;
        String str4;
        Bundle bundle;
        String str5;
        String str6;
        String str7;
        String str8;
        long jZzc;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        String str9;
        ApplicationInfo applicationInfo2;
        long j10;
        boolean z11;
        long j11;
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (zzak(zzqVar)) {
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
            if (zzhVarZzj != null && TextUtils.isEmpty(zzhVarZzj.zzy()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                zzhVarZzj.zzL(0L);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzamVar2.zzD(zzhVarZzj);
                zzfp zzfpVar = this.zzc;
                zzal(zzfpVar);
                zzfpVar.zzm(zzqVar.zza);
            }
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            long jCurrentTimeMillis = zzqVar.zzm;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = zzav().currentTimeMillis();
            }
            this.zzn.zzg().zzd();
            int i11 = zzqVar.zzn;
            if (i11 != 0 && i11 != 1) {
                zzay().zzk().zzc("Incorrect app type, assuming installed app. appId, appType", zzeo.zzn(zzqVar.zza), Integer.valueOf(i11));
                i11 = 0;
            }
            zzam zzamVar3 = this.zze;
            zzal(zzamVar3);
            zzamVar3.zzw();
            try {
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzle zzleVarZzp = zzamVar4.zzp(zzqVar.zza, "_npa");
                if (zzleVarZzp != null && !"auto".equals(zzleVarZzp.zzb)) {
                    str = "_sysu";
                    str2 = "_sys";
                    i10 = 1;
                } else if (zzqVar.zzr != null) {
                    str = "_sysu";
                    str2 = "_sys";
                    i10 = 1;
                    zzlc zzlcVar = new zzlc("_npa", jCurrentTimeMillis, Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto");
                    if (zzleVarZzp == null || !zzleVarZzp.zze.equals(zzlcVar.zzd)) {
                        zzW(zzlcVar, zzqVar);
                    }
                } else {
                    str = "_sysu";
                    str2 = "_sys";
                    i10 = 1;
                    if (zzleVarZzp != null) {
                        zzP(new zzlc("_npa", jCurrentTimeMillis, null, "auto"), zzqVar);
                    }
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzh zzhVarZzj2 = zzamVar5.zzj((String) Preconditions.checkNotNull(zzqVar.zza));
                if (zzhVarZzj2 == null || !zzv().zzam(zzqVar.zzb, zzhVarZzj2.zzy(), zzqVar.zzq, zzhVarZzj2.zzr())) {
                    str3 = "_pfo";
                } else {
                    zzay().zzk().zzb("New GMP App Id passed in. Removing cached database data. appId", zzeo.zzn(zzhVarZzj2.zzt()));
                    zzam zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    String strZzt = zzhVarZzj2.zzt();
                    zzamVar6.zzW();
                    zzamVar6.zzg();
                    Preconditions.checkNotEmpty(strZzt);
                    try {
                        SQLiteDatabase sQLiteDatabaseZzh = zzamVar6.zzh();
                        String[] strArr = new String[i10];
                        strArr[0] = strZzt;
                        int iDelete = sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("consent_settings", "app_id=?", strArr);
                        zzoh.zzc();
                        str3 = "_pfo";
                        try {
                            if (zzamVar6.zzs.zzf().zzs(null, zzeb.zzaB)) {
                                iDelete += sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
                            }
                            if (iDelete > 0) {
                                zzamVar6.zzs.zzay().zzj().zzc("Deleted application data. app, records", strZzt, Integer.valueOf(iDelete));
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            zzamVar6.zzs.zzay().zzd().zzc("Error deleting application data. appId, error", zzeo.zzn(strZzt), e);
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        str3 = "_pfo";
                    }
                    zzhVarZzj2 = null;
                }
                if (zzhVarZzj2 != null) {
                    boolean z12 = (zzhVarZzj2.zzb() == -2147483648L || zzhVarZzj2.zzb() == zzqVar.zzj) ? false : true;
                    String strZzw = zzhVarZzj2.zzw();
                    if (z12 | ((zzhVarZzj2.zzb() != -2147483648L || strZzw == null || strZzw.equals(zzqVar.zzc)) ? false : true)) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("_pv", strZzw);
                        zzE(new zzaw("_au", new zzau(bundle2), "auto", jCurrentTimeMillis), zzqVar);
                    }
                }
                zzd(zzqVar);
                if (i11 == 0) {
                    zzam zzamVar7 = this.zze;
                    zzal(zzamVar7);
                    zzasVarZzn = zzamVar7.zzn(zzqVar.zza, "_f");
                    z10 = false;
                } else {
                    zzam zzamVar8 = this.zze;
                    zzal(zzamVar8);
                    zzasVarZzn = zzamVar8.zzn(zzqVar.zza, "_v");
                    z10 = true;
                }
                if (zzasVarZzn == null) {
                    long j12 = ((jCurrentTimeMillis / 3600000) + 1) * 3600000;
                    if (z10) {
                        zzW(new zzlc("_fvt", jCurrentTimeMillis, Long.valueOf(j12), "auto"), zzqVar);
                        zzaz().zzg();
                        zzB();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("_c", 1L);
                        bundle3.putLong("_r", 1L);
                        bundle3.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle3.putLong("_dac", 1L);
                        }
                        zzawVar = new zzaw("_v", new zzau(bundle3), "auto", jCurrentTimeMillis);
                        zzG(zzawVar, zzqVar);
                    } else {
                        zzW(new zzlc("_fot", jCurrentTimeMillis, Long.valueOf(j12), "auto"), zzqVar);
                        zzaz().zzg();
                        zzfg zzfgVar = (zzfg) Preconditions.checkNotNull(this.zzm);
                        String str10 = zzqVar.zza;
                        if (str10 == null || str10.isEmpty()) {
                            zzemVarZzm = zzfgVar.zza.zzay().zzm();
                            str4 = "Install Referrer Reporter was called with invalid app package name";
                        } else {
                            zzfgVar.zza.zzaz().zzg();
                            if (zzfgVar.zza()) {
                                zzff zzffVar = new zzff(zzfgVar, str10);
                                zzfgVar.zza.zzaz().zzg();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = zzfgVar.zza.zzau().getPackageManager();
                                if (packageManager == null) {
                                    zzemVarZzm = zzfgVar.zza.zzay().zzm();
                                    str4 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer";
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        zzemVarZzm = zzfgVar.zza.zzay().zzi();
                                        str4 = "Play Service for fetching Install Referrer is unavailable on device";
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str11 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str11) && zzfgVar.zza()) {
                                                try {
                                                    zzfgVar.zza.zzay().zzj().zzb("Install Referrer Service is", true != ConnectionTracker.getInstance().bindService(zzfgVar.zza.zzau(), new Intent(intent), zzffVar, 1) ? "not available" : "available");
                                                } catch (RuntimeException e12) {
                                                    zzfgVar.zza.zzay().zzd().zzb("Exception occurred while binding to Install Referrer Service", e12.getMessage());
                                                }
                                            } else {
                                                zzemVarZzm = zzfgVar.zza.zzay().zzk();
                                                str4 = "Play Store version 8.3.73 or higher required for Install Referrer";
                                            }
                                        }
                                        zzaz().zzg();
                                        zzB();
                                        bundle = new Bundle();
                                        bundle.putLong("_c", 1L);
                                        bundle.putLong("_r", 1L);
                                        bundle.putLong("_uwa", 0L);
                                        str5 = str3;
                                        bundle.putLong(str5, 0L);
                                        str6 = str2;
                                        bundle.putLong(str6, 0L);
                                        str7 = str;
                                        bundle.putLong(str7, 0L);
                                        bundle.putLong("_et", 1L);
                                        if (zzqVar.zzp) {
                                            bundle.putLong("_dac", 1L);
                                        }
                                        str8 = (String) Preconditions.checkNotNull(zzqVar.zza);
                                        zzam zzamVar9 = this.zze;
                                        zzal(zzamVar9);
                                        Preconditions.checkNotEmpty(str8);
                                        zzamVar9.zzg();
                                        zzamVar9.zzW();
                                        jZzc = zzamVar9.zzc(str8, "first_open_count");
                                        if (this.zzn.zzau().getPackageManager() == null) {
                                            zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeo.zzn(str8));
                                        } else {
                                            try {
                                                packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str8, 0);
                                            } catch (PackageManager.NameNotFoundException e13) {
                                                zzay().zzd().zzc("Package info is null, first open report might be inaccurate. appId", zzeo.zzn(str8), e13);
                                                packageInfo = null;
                                            }
                                            if (packageInfo != null) {
                                                j10 = packageInfo.firstInstallTime;
                                                if (j10 != 0) {
                                                    if (j10 != packageInfo.lastUpdateTime) {
                                                        applicationInfo = null;
                                                        if (zzg().zzs(null, zzeb.zzab)) {
                                                            bundle.putLong("_uwa", 1L);
                                                        } else if (jZzc == 0) {
                                                            bundle.putLong("_uwa", 1L);
                                                            z11 = false;
                                                            jZzc = 0;
                                                        }
                                                        z11 = false;
                                                    } else {
                                                        applicationInfo = null;
                                                        z11 = true;
                                                    }
                                                    if (true != z11) {
                                                        j11 = 0;
                                                    } else {
                                                        j11 = 1;
                                                    }
                                                    zzW(new zzlc("_fi", jCurrentTimeMillis, Long.valueOf(j11), "auto"), zzqVar);
                                                } else {
                                                    applicationInfo = null;
                                                }
                                            } else {
                                                applicationInfo = null;
                                            }
                                            try {
                                                str9 = str8;
                                                try {
                                                    applicationInfo2 = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str9, 0);
                                                } catch (PackageManager.NameNotFoundException e14) {
                                                    e = e14;
                                                    zzay().zzd().zzc("Application info is null, first open report might be inaccurate. appId", zzeo.zzn(str9), e);
                                                    applicationInfo2 = applicationInfo;
                                                }
                                            } catch (PackageManager.NameNotFoundException e15) {
                                                e = e15;
                                                str9 = str8;
                                            }
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    bundle.putLong(str6, 1L);
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle.putLong(str7, 1L);
                                                }
                                            }
                                        }
                                        if (jZzc >= 0) {
                                            bundle.putLong(str5, jZzc);
                                        }
                                        zzG(new zzaw("_f", new zzau(bundle), "auto", jCurrentTimeMillis), zzqVar);
                                    }
                                }
                            } else {
                                zzemVarZzm = zzfgVar.zza.zzay().zzi();
                                str4 = "Install Referrer Reporter is not available";
                            }
                        }
                        zzemVarZzm.zza(str4);
                        zzaz().zzg();
                        zzB();
                        bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_uwa", 0L);
                        str5 = str3;
                        bundle.putLong(str5, 0L);
                        str6 = str2;
                        bundle.putLong(str6, 0L);
                        str7 = str;
                        bundle.putLong(str7, 0L);
                        bundle.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle.putLong("_dac", 1L);
                        }
                        str8 = (String) Preconditions.checkNotNull(zzqVar.zza);
                        zzam zzamVar10 = this.zze;
                        zzal(zzamVar10);
                        Preconditions.checkNotEmpty(str8);
                        zzamVar10.zzg();
                        zzamVar10.zzW();
                        jZzc = zzamVar10.zzc(str8, "first_open_count");
                        if (this.zzn.zzau().getPackageManager() == null) {
                            zzay().zzd().zzb("PackageManager is null, first open report might be inaccurate. appId", zzeo.zzn(str8));
                        } else {
                            packageInfo = Wrappers.packageManager(this.zzn.zzau()).getPackageInfo(str8, 0);
                            if (packageInfo != null) {
                                j10 = packageInfo.firstInstallTime;
                                if (j10 != 0) {
                                    if (j10 != packageInfo.lastUpdateTime) {
                                        applicationInfo = null;
                                        if (zzg().zzs(null, zzeb.zzab)) {
                                            bundle.putLong("_uwa", 1L);
                                        } else if (jZzc == 0) {
                                            bundle.putLong("_uwa", 1L);
                                            z11 = false;
                                            jZzc = 0;
                                        }
                                        z11 = false;
                                    } else {
                                        applicationInfo = null;
                                        z11 = true;
                                    }
                                    if (true != z11) {
                                        j11 = 0;
                                    } else {
                                        j11 = 1;
                                    }
                                    zzW(new zzlc("_fi", jCurrentTimeMillis, Long.valueOf(j11), "auto"), zzqVar);
                                } else {
                                    applicationInfo = null;
                                }
                            } else {
                                applicationInfo = null;
                            }
                            str9 = str8;
                            applicationInfo2 = Wrappers.packageManager(this.zzn.zzau()).getApplicationInfo(str9, 0);
                            if (applicationInfo2 != null) {
                                if ((applicationInfo2.flags & 1) != 0) {
                                    bundle.putLong(str6, 1L);
                                }
                                if ((applicationInfo2.flags & 128) != 0) {
                                    bundle.putLong(str7, 1L);
                                }
                            }
                        }
                        if (jZzc >= 0) {
                            bundle.putLong(str5, jZzc);
                        }
                        zzG(new zzaw("_f", new zzau(bundle), "auto", jCurrentTimeMillis), zzqVar);
                    }
                } else if (zzqVar.zzi) {
                    zzawVar = new zzaw("_cd", new zzau(new Bundle()), "auto", jCurrentTimeMillis);
                    zzG(zzawVar, zzqVar);
                }
                zzam zzamVar11 = this.zze;
                zzal(zzamVar11);
                zzamVar11.zzC();
                zzam zzamVar12 = this.zze;
                zzal(zzamVar12);
                zzamVar12.zzx();
            } catch (Throwable th) {
                zzam zzamVar13 = this.zze;
                zzal(zzamVar13);
                zzamVar13.zzx();
                throw th;
            }
        }
    }

    public final void zzM() {
        this.zzr++;
    }

    public final void zzN(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzO(zzacVar, zzqVarZzac);
        }
    }

    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzacVarZzk != null) {
                    zzay().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzamVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzacVarZzk.zze) {
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        zzY((zzaw) Preconditions.checkNotNull(zzv().zzz(str, ((zzaw) Preconditions.checkNotNull(zzacVar.zzk)).zza, zzauVar != null ? zzauVar.zzc() : null, zzacVarZzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzay().zzk().zzc("Conditional user property doesn't exist", zzeo.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    public final void zzP(zzlc zzlcVar, zzq zzqVar) {
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            if ("_npa".equals(zzlcVar.zzb) && zzqVar.zzr != null) {
                zzay().zzc().zza("Falling back to manifest metadata value for ad personalization");
                zzW(new zzlc("_npa", zzav().currentTimeMillis(), Long.valueOf(true != zzqVar.zzr.booleanValue() ? 0L : 1L), "auto"), zzqVar);
                return;
            }
            zzay().zzc().zzb("Removing user property", this.zzn.zzj().zzf(zzlcVar.zzb));
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(zzlcVar.zzb)) {
                    zzam zzamVar2 = this.zze;
                    zzal(zzamVar2);
                    zzamVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzam zzamVar3 = this.zze;
                zzal(zzamVar3);
                zzamVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), zzlcVar.zzb);
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzamVar4.zzC();
                zzay().zzc().zzb("User property removed", this.zzn.zzj().zzf(zzlcVar.zzb));
            } finally {
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzx();
            }
        }
    }

    @VisibleForTesting
    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzamVar.zzg();
        zzamVar.zzW();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseZzh.delete("apps", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("queue", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseZzh.delete("default_event_params", "app_id=?", strArr);
            if (iDelete > 0) {
                zzamVar.zzs.zzay().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e10) {
            zzamVar.zzs.zzay().zzd().zzc("Error resetting analytics data. appId, error", zzeo.zzn(str), e10);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzik zzikVar) {
        zzaz().zzg();
        String str2 = this.zzE;
        if (str2 == null || str2.equals(str) || zzikVar != null) {
            this.zzE = str;
            this.zzD = zzikVar;
        }
    }

    public final void zzS() {
        zzaz().zzg();
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzamVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzav().currentTimeMillis());
        }
        zzag();
    }

    public final void zzT(zzac zzacVar) {
        zzq zzqVarZzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarZzac != null) {
            zzU(zzacVar, zzqVarZzac);
        }
    }

    public final void zzU(zzac zzacVar, zzq zzqVar) {
        zzem zzemVarZzd;
        String str;
        Object objZzn;
        String strZzf;
        Object objZza;
        zzem zzemVarZzd2;
        String str2;
        Object objZzn2;
        String strZzf2;
        Object obj;
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z10 = false;
            zzacVar2.zze = false;
            zzam zzamVar = this.zze;
            zzal(zzamVar);
            zzamVar.zzw();
            try {
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                zzac zzacVarZzk = zzamVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
                if (zzacVarZzk != null && !zzacVarZzk.zzb.equals(zzacVar2.zzb)) {
                    zzay().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzacVarZzk.zzb);
                }
                if (zzacVarZzk != null && zzacVarZzk.zze) {
                    zzacVar2.zzb = zzacVarZzk.zzb;
                    zzacVar2.zzd = zzacVarZzk.zzd;
                    zzacVar2.zzh = zzacVarZzk.zzh;
                    zzacVar2.zzf = zzacVarZzk.zzf;
                    zzacVar2.zzi = zzacVarZzk.zzi;
                    zzacVar2.zze = true;
                    zzlc zzlcVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlc(zzlcVar.zzb, zzacVarZzk.zzc.zzc, zzlcVar.zza(), zzacVarZzk.zzc.zzf);
                } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlc zzlcVar2 = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlc(zzlcVar2.zzb, zzacVar2.zzd, zzlcVar2.zza(), zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z10 = true;
                }
                if (zzacVar2.zze) {
                    zzlc zzlcVar3 = zzacVar2.zzc;
                    zzle zzleVar = new zzle((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzlcVar3.zzb, zzlcVar3.zzc, Preconditions.checkNotNull(zzlcVar3.zza()));
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzL(zzleVar)) {
                        zzemVarZzd2 = zzay().zzc();
                        str2 = "User property updated immediately";
                        objZzn2 = zzacVar2.zza;
                        strZzf2 = this.zzn.zzj().zzf(zzleVar.zzc);
                        obj = zzleVar.zze;
                    } else {
                        zzemVarZzd2 = zzay().zzd();
                        str2 = "(2)Too many active user properties, ignoring";
                        objZzn2 = zzeo.zzn(zzacVar2.zza);
                        strZzf2 = this.zzn.zzj().zzf(zzleVar.zzc);
                        obj = zzleVar.zze;
                    }
                    zzemVarZzd2.zzd(str2, objZzn2, strZzf2, obj);
                    if (z10 && zzacVar2.zzi != null) {
                        zzY(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                    }
                }
                zzam zzamVar4 = this.zze;
                zzal(zzamVar4);
                if (zzamVar4.zzK(zzacVar2)) {
                    zzemVarZzd = zzay().zzc();
                    str = "Conditional property added";
                    objZzn = zzacVar2.zza;
                    strZzf = this.zzn.zzj().zzf(zzacVar2.zzc.zzb);
                    objZza = zzacVar2.zzc.zza();
                } else {
                    zzemVarZzd = zzay().zzd();
                    str = "Too many conditional properties, ignoring";
                    objZzn = zzeo.zzn(zzacVar2.zza);
                    strZzf = this.zzn.zzj().zzf(zzacVar2.zzc.zzb);
                    objZza = zzacVar2.zzc.zza();
                }
                zzemVarZzd.zzd(str, objZzn, strZzf, objZza);
                zzam zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzamVar5.zzC();
            } finally {
                zzam zzamVar6 = this.zze;
                zzal(zzamVar6);
                zzamVar6.zzx();
            }
        }
    }

    public final void zzV(String str, zzai zzaiVar) {
        zzaz().zzg();
        zzB();
        this.zzB.put(str, zzaiVar);
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaiVar);
        zzamVar.zzg();
        zzamVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaiVar.zzh());
        try {
            if (zzamVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzamVar.zzs.zzay().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzeo.zzn(str));
            }
        } catch (SQLiteException e10) {
            zzamVar.zzs.zzay().zzd().zzc("Error storing consent setting. appId, error", zzeo.zzn(str), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    public final void zzW(zzlc zzlcVar, zzq zzqVar) {
        zzas zzasVarZzn;
        long jLongValue;
        zzaz().zzg();
        zzB();
        if (zzak(zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            int iZzl = zzv().zzl(zzlcVar.zzb);
            int length = 0;
            if (iZzl != 0) {
                zzlh zzlhVarZzv = zzv();
                String str = zzlcVar.zzb;
                zzg();
                String strZzD = zzlhVarZzv.zzD(str, 24, true);
                String str2 = zzlcVar.zzb;
                zzv().zzN(this.zzF, zzqVar.zza, iZzl, "_ev", strZzD, str2 != null ? str2.length() : 0);
                return;
            }
            int iZzd = zzv().zzd(zzlcVar.zzb, zzlcVar.zza());
            if (iZzd != 0) {
                zzlh zzlhVarZzv2 = zzv();
                String str3 = zzlcVar.zzb;
                zzg();
                String strZzD2 = zzlhVarZzv2.zzD(str3, 24, true);
                Object objZza = zzlcVar.zza();
                if (objZza != null && ((objZza instanceof String) || (objZza instanceof CharSequence))) {
                    length = objZza.toString().length();
                }
                zzv().zzN(this.zzF, zzqVar.zza, iZzd, "_ev", strZzD2, length);
                return;
            }
            Object objZzB = zzv().zzB(zzlcVar.zzb, zzlcVar.zza());
            if (objZzB == null) {
                return;
            }
            if ("_sid".equals(zzlcVar.zzb)) {
                long j10 = zzlcVar.zzc;
                String str4 = zzlcVar.zzf;
                String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
                zzam zzamVar = this.zze;
                zzal(zzamVar);
                zzle zzleVarZzp = zzamVar.zzp(str5, "_sno");
                if (zzleVarZzp != null) {
                    Object obj = zzleVarZzp.zze;
                    if (obj instanceof Long) {
                        jLongValue = ((Long) obj).longValue();
                    } else {
                        if (zzleVarZzp != null) {
                            zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzleVarZzp.zze);
                        }
                        zzam zzamVar2 = this.zze;
                        zzal(zzamVar2);
                        zzasVarZzn = zzamVar2.zzn(str5, "_s");
                        if (zzasVarZzn != null) {
                            jLongValue = zzasVarZzn.zzc;
                            zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                        } else {
                            jLongValue = 0;
                        }
                    }
                } else {
                    if (zzleVarZzp != null) {
                        zzay().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzleVarZzp.zze);
                    }
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    zzasVarZzn = zzamVar3.zzn(str5, "_s");
                    if (zzasVarZzn != null) {
                        jLongValue = zzasVarZzn.zzc;
                        zzay().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(jLongValue));
                    } else {
                        jLongValue = 0;
                    }
                }
                zzW(new zzlc("_sno", j10, Long.valueOf(jLongValue + 1), str4), zzqVar);
            }
            zzle zzleVar = new zzle((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzlcVar.zzf), zzlcVar.zzb, zzlcVar.zzc, objZzB);
            zzay().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzleVar.zzc), objZzB);
            zzam zzamVar4 = this.zze;
            zzal(zzamVar4);
            zzamVar4.zzw();
            try {
                if ("_id".equals(zzleVar.zzc)) {
                    zzam zzamVar5 = this.zze;
                    zzal(zzamVar5);
                    zzle zzleVarZzp2 = zzamVar5.zzp(zzqVar.zza, "_id");
                    if (zzleVarZzp2 != null && !zzleVar.zze.equals(zzleVarZzp2.zze)) {
                        zzam zzamVar6 = this.zze;
                        zzal(zzamVar6);
                        zzamVar6.zzA(zzqVar.zza, "_lair");
                    }
                }
                zzd(zzqVar);
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                boolean zZzL = zzamVar7.zzL(zzleVar);
                zzam zzamVar8 = this.zze;
                zzal(zzamVar8);
                zzamVar8.zzC();
                if (!zZzL) {
                    zzay().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                    zzv().zzN(this.zzF, zzqVar.zza, 9, null, null, 0);
                }
            } finally {
                zzam zzamVar9 = this.zze;
                zzal(zzamVar9);
                zzamVar9.zzx();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x028a A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0296 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02a0 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c3 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x02d8 A[Catch: all -> 0x057e, TRY_LEAVE, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x02ef A[Catch: all -> 0x057e, EDGE_INSN: B:149:0x02e3->B:154:0x02ef BREAK  A[LOOP:2: B:141:0x02bd->B:153:0x02ec], PHI: r0
  0x02ef: PHI (r0v45 java.util.List) = (r0v44 java.util.List), (r0v44 java.util.List), (r0v44 java.util.List), (r0v71 java.util.List) binds: [B:131:0x0294, B:139:0x02ba, B:284:0x02ef, B:149:0x02e3] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x030a A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0318  */
    /* JADX WARN: Code duplicated, block: B:162:0x033e A[Catch: all -> 0x057e, TRY_LEAVE, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0378 A[Catch: all -> 0x057e, TRY_ENTER, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x037d A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0385 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x038d A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x039c A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03cf A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:186:0x0403 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0414 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0449 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0453 A[Catch: all -> 0x057e, TRY_LEAVE, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x046d A[Catch: MalformedURLException -> 0x04da, all -> 0x057e, TryCatch #13 {MalformedURLException -> 0x04da, blocks: (B:193:0x045b, B:195:0x046d, B:197:0x0482, B:200:0x048e, B:201:0x0492, B:202:0x0496, B:196:0x047b), top: B:260:0x045b, outer: #21 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x047b A[Catch: MalformedURLException -> 0x04da, all -> 0x057e, TryCatch #13 {MalformedURLException -> 0x04da, blocks: (B:193:0x045b, B:195:0x046d, B:197:0x0482, B:200:0x048e, B:201:0x0492, B:202:0x0496, B:196:0x047b), top: B:260:0x045b, outer: #21 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x048d  */
    /* JADX WARN: Code duplicated, block: B:233:0x0563 A[Catch: all -> 0x057e, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x056e A[Catch: all -> 0x057e, TRY_LEAVE, TryCatch #21 {all -> 0x057e, blocks: (B:128:0x0284, B:130:0x028a, B:132:0x0296, B:133:0x029a, B:135:0x02a0, B:137:0x02b4, B:141:0x02bd, B:143:0x02c3, B:146:0x02d8, B:154:0x02ef, B:156:0x030a, B:160:0x0319, B:162:0x033e, B:166:0x0378, B:168:0x037d, B:170:0x0385, B:171:0x0388, B:173:0x038d, B:174:0x0390, B:176:0x039c, B:177:0x03b2, B:180:0x03be, B:182:0x03cf, B:184:0x03e1, B:186:0x0403, B:188:0x0414, B:193:0x045b, B:195:0x046d, B:197:0x0482, B:201:0x0492, B:202:0x0496, B:196:0x047b, B:204:0x04da, B:189:0x0449, B:190:0x0450, B:191:0x0453, B:115:0x0255, B:127:0x0281, B:208:0x04f1, B:209:0x04f4, B:210:0x04f5, B:215:0x0536, B:231:0x055d, B:233:0x0563, B:235:0x056e, B:219:0x053f, B:240:0x057a, B:241:0x057d, B:200:0x048e), top: B:269:0x00da, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:? A[LOOP:1: B:133:0x029a->B:282:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0255 A[ADDED_TO_REGION, EDGE_INSN: B:292:0x0255->B:115:0x0255 BREAK  A[LOOP:4: B:73:0x0194->B:114:0x024e], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x01be A[EDGE_INSN: B:294:0x01be->B:79:0x01be BREAK  A[LOOP:5: B:248:0x01b8->B:97:0x0216], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x011f A[Catch: all -> 0x0581, TryCatch #2 {all -> 0x0581, blocks: (B:3:0x0010, B:5:0x0021, B:6:0x002b, B:10:0x0034, B:12:0x003a, B:13:0x0045, B:15:0x004d, B:16:0x0051, B:18:0x005c, B:19:0x0067, B:21:0x0072, B:22:0x0080, B:24:0x009f, B:26:0x00a5, B:27:0x00a8, B:29:0x00b4, B:30:0x00cb, B:32:0x00dc, B:34:0x00e2, B:38:0x00f7, B:51:0x0118, B:55:0x011f, B:56:0x0122, B:57:0x0123, B:61:0x014b, B:65:0x0153, B:70:0x0187, B:200:0x048e), top: B:250:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:60:0x014a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183 A[Catch: SQLiteException -> 0x025c, all -> 0x04ed, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x025c, blocks: (B:67:0x017d, B:69:0x0183, B:72:0x018e, B:73:0x0194, B:74:0x0198, B:75:0x01a3), top: B:259:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018e A[Catch: SQLiteException -> 0x025c, all -> 0x04ed, TRY_ENTER, TryCatch #10 {SQLiteException -> 0x025c, blocks: (B:67:0x017d, B:69:0x0183, B:72:0x018e, B:73:0x0194, B:74:0x0198, B:75:0x01a3), top: B:259:0x017d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01e5 A[Catch: SQLiteException -> 0x025a, all -> 0x04ed, TryCatch #3 {SQLiteException -> 0x025a, blocks: (B:77:0x01b8, B:79:0x01be, B:80:0x01c8, B:82:0x01ce, B:86:0x01d4, B:88:0x01df, B:90:0x01e5, B:91:0x01ec, B:110:0x0245, B:93:0x0201, B:94:0x0211, B:97:0x0216, B:103:0x021f, B:104:0x022e, B:109:0x0234), top: B:248:0x01b8 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0215  */
    /* JADX WARN: Instruction removed from duplicated block: B:188:0x0414, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0577: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:238:0x0577 */
    public final void zzX() {
        boolean z10;
        Cursor cursor;
        Cursor cursor2;
        Cursor cursorRawQuery;
        String string;
        zzh zzhVarZzj;
        int iZze;
        int iMax;
        zzam zzamVar;
        boolean z11;
        boolean z12;
        Cursor cursor3;
        long j10;
        Cursor cursorQuery;
        List listEmptyList;
        com.google.android.gms.internal.measurement.zzfz zzfzVarZza;
        int size;
        ArrayList arrayList;
        boolean z13;
        boolean zZzi;
        boolean zZzi2;
        boolean zZzs;
        int i10;
        String strZzm;
        zzko zzkoVar;
        Object objZza;
        String string2;
        String strZzx;
        String strZzi;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        Iterator it;
        String strZzJ;
        int i11;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        com.google.android.gms.internal.measurement.zzgc zzgcVar2;
        ArrayList arrayList2;
        int length;
        long j11;
        zzem zzemVarZzd;
        String str;
        Object objZzn;
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i12;
        byte[] byteArray;
        com.google.android.gms.internal.measurement.zzgb zzgbVar2;
        Cursor cursorRawQuery2;
        zzem zzemVarZzj;
        String str2;
        zzaz().zzg();
        zzB();
        int i13 = 1;
        this.zzv = true;
        int i14 = 0;
        try {
            this.zzn.zzaw();
            Boolean boolZzj = this.zzn.zzt().zzj();
            if (boolZzj == null) {
                zzemVarZzj = zzay().zzk();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!boolZzj.booleanValue()) {
                    if (this.zza <= 0) {
                        zzaz().zzg();
                        if (this.zzy != null) {
                            zzemVarZzj = zzay().zzj();
                            str2 = "Uploading requested multiple times";
                        } else {
                            zzeu zzeuVar = this.zzd;
                            zzal(zzeuVar);
                            if (zzeuVar.zza()) {
                                long jCurrentTimeMillis = zzav().currentTimeMillis();
                                Cursor cursor4 = null;
                                int iZze2 = zzg().zze(null, zzeb.zzP);
                                zzg();
                                long jZzz = jCurrentTimeMillis - zzag.zzz();
                                for (int i15 = 0; i15 < iZze2 && zzah(null, jZzz); i15++) {
                                }
                                long jZza = this.zzk.zzc.zza();
                                if (jZza != 0) {
                                    zzay().zzc().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jZza)));
                                }
                                zzam zzamVar2 = this.zze;
                                zzal(zzamVar2);
                                String strZzr = zzamVar2.zzr();
                                long j12 = -1;
                                try {
                                    if (TextUtils.isEmpty(strZzr)) {
                                        try {
                                            this.zzA = -1L;
                                            zzam zzamVar3 = this.zze;
                                            zzal(zzamVar3);
                                            zzg();
                                            long jZzz2 = jCurrentTimeMillis - zzag.zzz();
                                            zzamVar3.zzg();
                                            zzamVar3.zzW();
                                            try {
                                                cursorRawQuery = zzamVar3.zzh().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jZzz2)});
                                                try {
                                                    if (cursorRawQuery.moveToFirst()) {
                                                        string = cursorRawQuery.getString(0);
                                                        cursorRawQuery.close();
                                                    } else {
                                                        zzamVar3.zzs.zzay().zzj().zza("No expired configs for apps with pending events");
                                                        cursorRawQuery.close();
                                                        string = null;
                                                    }
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    zzamVar3.zzs.zzay().zzd().zzb("Error selecting expired configs", e);
                                                    if (cursorRawQuery != null) {
                                                    }
                                                    string = null;
                                                    if (!TextUtils.isEmpty(string)) {
                                                        zzam zzamVar4 = this.zze;
                                                        zzal(zzamVar4);
                                                        zzhVarZzj = zzamVar4.zzj(string);
                                                        if (zzhVarZzj != null) {
                                                            zzD(zzhVarZzj);
                                                        }
                                                    }
                                                    this.zzv = false;
                                                    zzae();
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                cursorRawQuery = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor2 = null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                throw th;
                                            }
                                            if (!TextUtils.isEmpty(string)) {
                                                zzam zzamVar5 = this.zze;
                                                zzal(zzamVar5);
                                                zzhVarZzj = zzamVar5.zzj(string);
                                                if (zzhVarZzj != null) {
                                                    zzD(zzhVarZzj);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor;
                                        }
                                    } else {
                                        if (this.zzA == -1) {
                                            zzam zzamVar6 = this.zze;
                                            zzal(zzamVar6);
                                            try {
                                                cursorRawQuery2 = zzamVar6.zzh().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                                try {
                                                    try {
                                                        if (cursorRawQuery2.moveToFirst()) {
                                                            j12 = cursorRawQuery2.getLong(0);
                                                        }
                                                    } catch (SQLiteException e12) {
                                                        e = e12;
                                                        zzamVar6.zzs.zzay().zzd().zzb("Error querying raw events", e);
                                                        if (cursorRawQuery2 != null) {
                                                        }
                                                        this.zzA = j12;
                                                        iZze = zzg().zze(strZzr, zzeb.zzf);
                                                        iMax = Math.max(0, zzg().zze(strZzr, zzeb.zzg));
                                                        zzamVar = this.zze;
                                                        zzal(zzamVar);
                                                        zzamVar.zzg();
                                                        zzamVar.zzW();
                                                        if (iZze > 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        Preconditions.checkArgument(z11);
                                                        if (iMax > 0) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        Preconditions.checkArgument(z12);
                                                        Preconditions.checkNotEmpty(strZzr);
                                                        cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                                        try {
                                                            try {
                                                                if (cursorQuery.moveToFirst()) {
                                                                    arrayList2 = new ArrayList();
                                                                    length = 0;
                                                                    while (true) {
                                                                        j11 = cursorQuery.getLong(i14);
                                                                        try {
                                                                            byte[] blob = cursorQuery.getBlob(i13);
                                                                            zzlb zzlbVar = zzamVar.zzf.zzi;
                                                                            zzal(zzlbVar);
                                                                            try {
                                                                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                                                bArr = new byte[1024];
                                                                                j10 = jCurrentTimeMillis;
                                                                                while (true) {
                                                                                    try {
                                                                                        try {
                                                                                            i12 = gZIPInputStream.read(bArr);
                                                                                            if (i12 <= 0) {
                                                                                                break;
                                                                                            } else {
                                                                                                byteArrayOutputStream.write(bArr, 0, i12);
                                                                                            }
                                                                                        } catch (IOException e13) {
                                                                                            e = e13;
                                                                                            try {
                                                                                                zzlbVar.zzs.zzay().zzd().zzb("Failed to ungzip content", e);
                                                                                                throw e;
                                                                                            } catch (IOException e14) {
                                                                                                e = e14;
                                                                                                zzemVarZzd = zzamVar.zzs.zzay().zzd();
                                                                                                str = "Failed to unzip queued bundle. appId";
                                                                                                objZzn = zzeo.zzn(strZzr);
                                                                                                zzemVarZzd.zzc(str, objZzn, e);
                                                                                                if (cursorQuery.moveToNext()) {
                                                                                                    break;
                                                                                                } else {
                                                                                                    break;
                                                                                                }
                                                                                                cursorQuery.close();
                                                                                                listEmptyList = arrayList2;
                                                                                                if (!listEmptyList.isEmpty()) {
                                                                                                    if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                                                        it = listEmptyList.iterator();
                                                                                                        while (true) {
                                                                                                            if (!it.hasNext()) {
                                                                                                                strZzJ = null;
                                                                                                                break;
                                                                                                            }
                                                                                                            zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                                                                                            if (!zzgcVar2.zzJ().isEmpty()) {
                                                                                                                strZzJ = zzgcVar2.zzJ();
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        if (strZzJ != null) {
                                                                                                            for (i11 = 0; i11 < listEmptyList.size(); i11++) {
                                                                                                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i11)).first;
                                                                                                                if (zzgcVar.zzJ().isEmpty()) {
                                                                                                                    try {
                                                                                                                        listEmptyList = listEmptyList.subList(0, i11);
                                                                                                                        break;
                                                                                                                    } catch (Throwable th3) {
                                                                                                                        th = th3;
                                                                                                                        z10 = false;
                                                                                                                        this.zzv = z10;
                                                                                                                        zzae();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                                                            size = listEmptyList.size();
                                                                                                            arrayList = new ArrayList(listEmptyList.size());
                                                                                                            if (zzg().zzt(strZzr)) {
                                                                                                                z13 = false;
                                                                                                            } else {
                                                                                                                z13 = false;
                                                                                                            }
                                                                                                            zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                                                            zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                                                            zzoz.zzc();
                                                                                                            zZzs = zzg().zzs(null, zzeb.zzar);
                                                                                                            i10 = 0;
                                                                                                            while (i10 < size) {
                                                                                                                zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                                                                zzg().zzh();
                                                                                                                zzgbVar.zzal(73000L);
                                                                                                                long j13 = j10;
                                                                                                                zzgbVar.zzak(j13);
                                                                                                                this.zzn.zzaw();
                                                                                                                try {
                                                                                                                    zzgbVar.zzag(false);
                                                                                                                    if (!z13) {
                                                                                                                        zzgbVar.zzq();
                                                                                                                    }
                                                                                                                    if (!zZzi) {
                                                                                                                        zzgbVar.zzx();
                                                                                                                        zzgbVar.zzt();
                                                                                                                    }
                                                                                                                    if (!zZzi2) {
                                                                                                                        zzgbVar.zzn();
                                                                                                                    }
                                                                                                                    zzC(strZzr, zzgbVar);
                                                                                                                    if (!zZzs) {
                                                                                                                        zzgbVar.zzy();
                                                                                                                    }
                                                                                                                    if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                                                                        byte[] bArrZzbv = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                                                                        zzlb zzlbVar2 = this.zzi;
                                                                                                                        zzal(zzlbVar2);
                                                                                                                        zzgbVar.zzJ(zzlbVar2.zzd(bArrZzbv));
                                                                                                                    }
                                                                                                                    zzfzVarZza.zza(zzgbVar);
                                                                                                                    i10++;
                                                                                                                    j10 = j13;
                                                                                                                } catch (Throwable th4) {
                                                                                                                    th = th4;
                                                                                                                    z10 = false;
                                                                                                                    this.zzv = z10;
                                                                                                                    zzae();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                            long j14 = j10;
                                                                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                                zzlb zzlbVar3 = this.zzi;
                                                                                                                zzal(zzlbVar3);
                                                                                                                strZzm = zzlbVar3.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                                                            } else {
                                                                                                                strZzm = null;
                                                                                                            }
                                                                                                            zzal(this.zzi);
                                                                                                            byte[] bArrZzbv2 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                                                            zzkoVar = this.zzl;
                                                                                                            zzow.zzc();
                                                                                                            try {
                                                                                                                if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                                                                    zzfp zzfpVar = zzkoVar.zzf.zzc;
                                                                                                                    zzal(zzfpVar);
                                                                                                                    strZzi = zzfpVar.zzi(strZzr);
                                                                                                                    if (TextUtils.isEmpty(strZzi)) {
                                                                                                                        objZza = zzeb.zzp.zza(null);
                                                                                                                    } else {
                                                                                                                        Uri uri = Uri.parse((String) zzeb.zzp.zza(null));
                                                                                                                        Uri.Builder builderBuildUpon = uri.buildUpon();
                                                                                                                        builderBuildUpon.authority(strZzi + "." + uri.getAuthority());
                                                                                                                        string2 = builderBuildUpon.build().toString();
                                                                                                                    }
                                                                                                                    URL url = new URL(string2);
                                                                                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                                    if (this.zzy != null) {
                                                                                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                                    } else {
                                                                                                                        this.zzy = new ArrayList(arrayList);
                                                                                                                    }
                                                                                                                    this.zzk.zzd.zzb(j14);
                                                                                                                    strZzx = CallerData.NA;
                                                                                                                    if (size > 0) {
                                                                                                                        strZzx = zzfzVarZza.zzb(0).zzx();
                                                                                                                    }
                                                                                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv2.length), strZzm);
                                                                                                                    this.zzu = true;
                                                                                                                    zzeu zzeuVar2 = this.zzd;
                                                                                                                    zzal(zzeuVar2);
                                                                                                                    zzkq zzkqVar = new zzkq(this, strZzr);
                                                                                                                    zzeuVar2.zzg();
                                                                                                                    zzeuVar2.zzW();
                                                                                                                    Preconditions.checkNotNull(url);
                                                                                                                    Preconditions.checkNotNull(bArrZzbv2);
                                                                                                                    Preconditions.checkNotNull(zzkqVar);
                                                                                                                    zzeuVar2.zzs.zzaz().zzo(new zzet(zzeuVar2, strZzr, url, bArrZzbv2, null, zzkqVar));
                                                                                                                } else {
                                                                                                                    objZza = zzeb.zzp.zza(null);
                                                                                                                }
                                                                                                                URL url2 = new URL(string2);
                                                                                                                Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                                if (this.zzy != null) {
                                                                                                                    zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                                } else {
                                                                                                                    this.zzy = new ArrayList(arrayList);
                                                                                                                }
                                                                                                                this.zzk.zzd.zzb(j14);
                                                                                                                strZzx = CallerData.NA;
                                                                                                                if (size > 0) {
                                                                                                                    strZzx = zzfzVarZza.zzb(0).zzx();
                                                                                                                }
                                                                                                                zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv2.length), strZzm);
                                                                                                                this.zzu = true;
                                                                                                                zzeu zzeuVar3 = this.zzd;
                                                                                                                zzal(zzeuVar3);
                                                                                                                zzkq zzkqVar2 = new zzkq(this, strZzr);
                                                                                                                zzeuVar3.zzg();
                                                                                                                zzeuVar3.zzW();
                                                                                                                Preconditions.checkNotNull(url2);
                                                                                                                Preconditions.checkNotNull(bArrZzbv2);
                                                                                                                Preconditions.checkNotNull(zzkqVar2);
                                                                                                                zzeuVar3.zzs.zzaz().zzo(new zzet(zzeuVar3, strZzr, url2, bArrZzbv2, null, zzkqVar2));
                                                                                                            } catch (MalformedURLException unused) {
                                                                                                                zzay().zzd().zzc("Failed to parse upload URL. Not uploading. appId", zzeo.zzn(strZzr), string2);
                                                                                                            }
                                                                                                            string2 = (String) objZza;
                                                                                                        } else {
                                                                                                            zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                                                            size = listEmptyList.size();
                                                                                                            arrayList = new ArrayList(listEmptyList.size());
                                                                                                            if (zzg().zzt(strZzr)) {
                                                                                                                z13 = false;
                                                                                                            } else {
                                                                                                                z13 = false;
                                                                                                            }
                                                                                                            zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                                                            zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                                                            zzoz.zzc();
                                                                                                            zZzs = zzg().zzs(null, zzeb.zzar);
                                                                                                            i10 = 0;
                                                                                                            while (i10 < size) {
                                                                                                                zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                                                                                arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                                                                zzg().zzh();
                                                                                                                zzgbVar.zzal(73000L);
                                                                                                                long j15 = j10;
                                                                                                                zzgbVar.zzak(j15);
                                                                                                                this.zzn.zzaw();
                                                                                                                zzgbVar.zzag(false);
                                                                                                                if (!z13) {
                                                                                                                    zzgbVar.zzq();
                                                                                                                }
                                                                                                                if (!zZzi) {
                                                                                                                    zzgbVar.zzx();
                                                                                                                    zzgbVar.zzt();
                                                                                                                }
                                                                                                                if (!zZzi2) {
                                                                                                                    zzgbVar.zzn();
                                                                                                                }
                                                                                                                zzC(strZzr, zzgbVar);
                                                                                                                if (!zZzs) {
                                                                                                                    zzgbVar.zzy();
                                                                                                                }
                                                                                                                if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                                                                    byte[] bArrZzbv3 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                                                                    zzlb zzlbVar4 = this.zzi;
                                                                                                                    zzal(zzlbVar4);
                                                                                                                    zzgbVar.zzJ(zzlbVar4.zzd(bArrZzbv3));
                                                                                                                }
                                                                                                                zzfzVarZza.zza(zzgbVar);
                                                                                                                i10++;
                                                                                                                j10 = j15;
                                                                                                            }
                                                                                                            long j16 = j10;
                                                                                                            if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                                zzlb zzlbVar5 = this.zzi;
                                                                                                                zzal(zzlbVar5);
                                                                                                                strZzm = zzlbVar5.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                                                            } else {
                                                                                                                strZzm = null;
                                                                                                            }
                                                                                                            zzal(this.zzi);
                                                                                                            byte[] bArrZzbv4 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                                                            zzkoVar = this.zzl;
                                                                                                            zzow.zzc();
                                                                                                            if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                                                                zzfp zzfpVar2 = zzkoVar.zzf.zzc;
                                                                                                                zzal(zzfpVar2);
                                                                                                                strZzi = zzfpVar2.zzi(strZzr);
                                                                                                                if (TextUtils.isEmpty(strZzi)) {
                                                                                                                    Uri uri2 = Uri.parse((String) zzeb.zzp.zza(null));
                                                                                                                    Uri.Builder builderBuildUpon2 = uri2.buildUpon();
                                                                                                                    builderBuildUpon2.authority(strZzi + "." + uri2.getAuthority());
                                                                                                                    string2 = builderBuildUpon2.build().toString();
                                                                                                                } else {
                                                                                                                    objZza = zzeb.zzp.zza(null);
                                                                                                                }
                                                                                                                URL url3 = new URL(string2);
                                                                                                                Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                                if (this.zzy != null) {
                                                                                                                    zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                                } else {
                                                                                                                    this.zzy = new ArrayList(arrayList);
                                                                                                                }
                                                                                                                this.zzk.zzd.zzb(j16);
                                                                                                                strZzx = CallerData.NA;
                                                                                                                if (size > 0) {
                                                                                                                    strZzx = zzfzVarZza.zzb(0).zzx();
                                                                                                                }
                                                                                                                zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv4.length), strZzm);
                                                                                                                this.zzu = true;
                                                                                                                zzeu zzeuVar4 = this.zzd;
                                                                                                                zzal(zzeuVar4);
                                                                                                                zzkq zzkqVar3 = new zzkq(this, strZzr);
                                                                                                                zzeuVar4.zzg();
                                                                                                                zzeuVar4.zzW();
                                                                                                                Preconditions.checkNotNull(url3);
                                                                                                                Preconditions.checkNotNull(bArrZzbv4);
                                                                                                                Preconditions.checkNotNull(zzkqVar3);
                                                                                                                zzeuVar4.zzs.zzaz().zzo(new zzet(zzeuVar4, strZzr, url3, bArrZzbv4, null, zzkqVar3));
                                                                                                            } else {
                                                                                                                objZza = zzeb.zzp.zza(null);
                                                                                                            }
                                                                                                            string2 = (String) objZza;
                                                                                                            URL url4 = new URL(string2);
                                                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                            if (this.zzy != null) {
                                                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                            } else {
                                                                                                                this.zzy = new ArrayList(arrayList);
                                                                                                            }
                                                                                                            this.zzk.zzd.zzb(j16);
                                                                                                            strZzx = CallerData.NA;
                                                                                                            if (size > 0) {
                                                                                                                strZzx = zzfzVarZza.zzb(0).zzx();
                                                                                                            }
                                                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv4.length), strZzm);
                                                                                                            this.zzu = true;
                                                                                                            zzeu zzeuVar5 = this.zzd;
                                                                                                            zzal(zzeuVar5);
                                                                                                            zzkq zzkqVar4 = new zzkq(this, strZzr);
                                                                                                            zzeuVar5.zzg();
                                                                                                            zzeuVar5.zzW();
                                                                                                            Preconditions.checkNotNull(url4);
                                                                                                            Preconditions.checkNotNull(bArrZzbv4);
                                                                                                            Preconditions.checkNotNull(zzkqVar4);
                                                                                                            zzeuVar5.zzs.zzaz().zzo(new zzet(zzeuVar5, strZzr, url4, bArrZzbv4, null, zzkqVar4));
                                                                                                        }
                                                                                                    } else {
                                                                                                        zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                                                        size = listEmptyList.size();
                                                                                                        arrayList = new ArrayList(listEmptyList.size());
                                                                                                        if (zzg().zzt(strZzr)) {
                                                                                                            z13 = false;
                                                                                                        } else {
                                                                                                            z13 = false;
                                                                                                        }
                                                                                                        zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                                                        zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                                                        zzoz.zzc();
                                                                                                        zZzs = zzg().zzs(null, zzeb.zzar);
                                                                                                        i10 = 0;
                                                                                                        while (i10 < size) {
                                                                                                            zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                                                                            arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                                                            zzg().zzh();
                                                                                                            zzgbVar.zzal(73000L);
                                                                                                            long j17 = j10;
                                                                                                            zzgbVar.zzak(j17);
                                                                                                            this.zzn.zzaw();
                                                                                                            zzgbVar.zzag(false);
                                                                                                            if (!z13) {
                                                                                                                zzgbVar.zzq();
                                                                                                            }
                                                                                                            if (!zZzi) {
                                                                                                                zzgbVar.zzx();
                                                                                                                zzgbVar.zzt();
                                                                                                            }
                                                                                                            if (!zZzi2) {
                                                                                                                zzgbVar.zzn();
                                                                                                            }
                                                                                                            zzC(strZzr, zzgbVar);
                                                                                                            if (!zZzs) {
                                                                                                                zzgbVar.zzy();
                                                                                                            }
                                                                                                            if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                                                                byte[] bArrZzbv5 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                                                                zzlb zzlbVar6 = this.zzi;
                                                                                                                zzal(zzlbVar6);
                                                                                                                zzgbVar.zzJ(zzlbVar6.zzd(bArrZzbv5));
                                                                                                            }
                                                                                                            zzfzVarZza.zza(zzgbVar);
                                                                                                            i10++;
                                                                                                            j10 = j17;
                                                                                                        }
                                                                                                        long j18 = j10;
                                                                                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                                                            zzlb zzlbVar7 = this.zzi;
                                                                                                            zzal(zzlbVar7);
                                                                                                            strZzm = zzlbVar7.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                                                        } else {
                                                                                                            strZzm = null;
                                                                                                        }
                                                                                                        zzal(this.zzi);
                                                                                                        byte[] bArrZzbv6 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                                                        zzkoVar = this.zzl;
                                                                                                        zzow.zzc();
                                                                                                        if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                                                            zzfp zzfpVar3 = zzkoVar.zzf.zzc;
                                                                                                            zzal(zzfpVar3);
                                                                                                            strZzi = zzfpVar3.zzi(strZzr);
                                                                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                                                                Uri uri3 = Uri.parse((String) zzeb.zzp.zza(null));
                                                                                                                Uri.Builder builderBuildUpon3 = uri3.buildUpon();
                                                                                                                builderBuildUpon3.authority(strZzi + "." + uri3.getAuthority());
                                                                                                                string2 = builderBuildUpon3.build().toString();
                                                                                                            } else {
                                                                                                                objZza = zzeb.zzp.zza(null);
                                                                                                            }
                                                                                                            URL url5 = new URL(string2);
                                                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                            if (this.zzy != null) {
                                                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                            } else {
                                                                                                                this.zzy = new ArrayList(arrayList);
                                                                                                            }
                                                                                                            this.zzk.zzd.zzb(j18);
                                                                                                            strZzx = CallerData.NA;
                                                                                                            if (size > 0) {
                                                                                                                strZzx = zzfzVarZza.zzb(0).zzx();
                                                                                                            }
                                                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv6.length), strZzm);
                                                                                                            this.zzu = true;
                                                                                                            zzeu zzeuVar6 = this.zzd;
                                                                                                            zzal(zzeuVar6);
                                                                                                            zzkq zzkqVar5 = new zzkq(this, strZzr);
                                                                                                            zzeuVar6.zzg();
                                                                                                            zzeuVar6.zzW();
                                                                                                            Preconditions.checkNotNull(url5);
                                                                                                            Preconditions.checkNotNull(bArrZzbv6);
                                                                                                            Preconditions.checkNotNull(zzkqVar5);
                                                                                                            zzeuVar6.zzs.zzaz().zzo(new zzet(zzeuVar6, strZzr, url5, bArrZzbv6, null, zzkqVar5));
                                                                                                        } else {
                                                                                                            objZza = zzeb.zzp.zza(null);
                                                                                                        }
                                                                                                        string2 = (String) objZza;
                                                                                                        URL url6 = new URL(string2);
                                                                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                                                                        if (this.zzy != null) {
                                                                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                                                        } else {
                                                                                                            this.zzy = new ArrayList(arrayList);
                                                                                                        }
                                                                                                        this.zzk.zzd.zzb(j18);
                                                                                                        strZzx = CallerData.NA;
                                                                                                        if (size > 0) {
                                                                                                            strZzx = zzfzVarZza.zzb(0).zzx();
                                                                                                        }
                                                                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv6.length), strZzm);
                                                                                                        this.zzu = true;
                                                                                                        zzeu zzeuVar7 = this.zzd;
                                                                                                        zzal(zzeuVar7);
                                                                                                        zzkq zzkqVar6 = new zzkq(this, strZzr);
                                                                                                        zzeuVar7.zzg();
                                                                                                        zzeuVar7.zzW();
                                                                                                        Preconditions.checkNotNull(url6);
                                                                                                        Preconditions.checkNotNull(bArrZzbv6);
                                                                                                        Preconditions.checkNotNull(zzkqVar6);
                                                                                                        zzeuVar7.zzs.zzaz().zzo(new zzet(zzeuVar7, strZzr, url6, bArrZzbv6, null, zzkqVar6));
                                                                                                    }
                                                                                                    zzae();
                                                                                                }
                                                                                                this.zzv = false;
                                                                                                zzae();
                                                                                            }
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        zzamVar.zzs.zzay().zzd().zzc("Error querying bundles. appId", zzeo.zzn(strZzr), e);
                                                                                        listEmptyList = Collections.emptyList();
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                    }
                                                                                }
                                                                                gZIPInputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                byteArray = byteArrayOutputStream.toByteArray();
                                                                                if (arrayList2.isEmpty()) {
                                                                                }
                                                                                try {
                                                                                    zzgbVar2 = (com.google.android.gms.internal.measurement.zzgb) zzlb.zzl(com.google.android.gms.internal.measurement.zzgc.zzt(), byteArray);
                                                                                    if (!cursorQuery.isNull(2)) {
                                                                                        zzgbVar2.zzaf(cursorQuery.getInt(2));
                                                                                    }
                                                                                    length += byteArray.length;
                                                                                    arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE(), Long.valueOf(j11)));
                                                                                } catch (IOException e16) {
                                                                                    e = e16;
                                                                                    zzemVarZzd = zzamVar.zzs.zzay().zzd();
                                                                                    str = "Failed to merge queued bundle. appId";
                                                                                    objZzn = zzeo.zzn(strZzr);
                                                                                    zzemVarZzd.zzc(str, objZzn, e);
                                                                                }
                                                                                if (cursorQuery.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                jCurrentTimeMillis = j10;
                                                                                i13 = 1;
                                                                                i14 = 0;
                                                                            } catch (IOException e17) {
                                                                                e = e17;
                                                                                j10 = jCurrentTimeMillis;
                                                                            }
                                                                        } catch (IOException e18) {
                                                                            e = e18;
                                                                            j10 = jCurrentTimeMillis;
                                                                        }
                                                                    }
                                                                    cursorQuery.close();
                                                                    listEmptyList = arrayList2;
                                                                } else {
                                                                    listEmptyList = Collections.emptyList();
                                                                    cursorQuery.close();
                                                                    j10 = jCurrentTimeMillis;
                                                                }
                                                            } catch (SQLiteException e19) {
                                                                e = e19;
                                                                j10 = jCurrentTimeMillis;
                                                            }
                                                            if (!listEmptyList.isEmpty()) {
                                                                if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                                    it = listEmptyList.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            strZzJ = null;
                                                                            break;
                                                                        }
                                                                        zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                                                        if (!zzgcVar2.zzJ().isEmpty()) {
                                                                            strZzJ = zzgcVar2.zzJ();
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (strZzJ != null) {
                                                                        while (i11 < listEmptyList.size()) {
                                                                            zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i11)).first;
                                                                            if (zzgcVar.zzJ().isEmpty()) {
                                                                                listEmptyList = listEmptyList.subList(0, i11);
                                                                                break;
                                                                            }
                                                                        }
                                                                        zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                        size = listEmptyList.size();
                                                                        arrayList = new ArrayList(listEmptyList.size());
                                                                        if (zzg().zzt(strZzr)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                        zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                        zzoz.zzc();
                                                                        zZzs = zzg().zzs(null, zzeb.zzar);
                                                                        i10 = 0;
                                                                        while (i10 < size) {
                                                                            zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                                            arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                            zzg().zzh();
                                                                            zzgbVar.zzal(73000L);
                                                                            long j19 = j10;
                                                                            zzgbVar.zzak(j19);
                                                                            this.zzn.zzaw();
                                                                            zzgbVar.zzag(false);
                                                                            if (!z13) {
                                                                                zzgbVar.zzq();
                                                                            }
                                                                            if (!zZzi) {
                                                                                zzgbVar.zzx();
                                                                                zzgbVar.zzt();
                                                                            }
                                                                            if (!zZzi2) {
                                                                                zzgbVar.zzn();
                                                                            }
                                                                            zzC(strZzr, zzgbVar);
                                                                            if (!zZzs) {
                                                                                zzgbVar.zzy();
                                                                            }
                                                                            if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                                byte[] bArrZzbv7 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                                zzlb zzlbVar8 = this.zzi;
                                                                                zzal(zzlbVar8);
                                                                                zzgbVar.zzJ(zzlbVar8.zzd(bArrZzbv7));
                                                                            }
                                                                            zzfzVarZza.zza(zzgbVar);
                                                                            i10++;
                                                                            j10 = j19;
                                                                        }
                                                                        long j110 = j10;
                                                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                            zzlb zzlbVar9 = this.zzi;
                                                                            zzal(zzlbVar9);
                                                                            strZzm = zzlbVar9.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                        } else {
                                                                            strZzm = null;
                                                                        }
                                                                        zzal(this.zzi);
                                                                        byte[] bArrZzbv8 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                        zzkoVar = this.zzl;
                                                                        zzow.zzc();
                                                                        if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                            zzfp zzfpVar4 = zzkoVar.zzf.zzc;
                                                                            zzal(zzfpVar4);
                                                                            strZzi = zzfpVar4.zzi(strZzr);
                                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                                Uri uri4 = Uri.parse((String) zzeb.zzp.zza(null));
                                                                                Uri.Builder builderBuildUpon4 = uri4.buildUpon();
                                                                                builderBuildUpon4.authority(strZzi + "." + uri4.getAuthority());
                                                                                string2 = builderBuildUpon4.build().toString();
                                                                            } else {
                                                                                objZza = zzeb.zzp.zza(null);
                                                                            }
                                                                            URL url7 = new URL(string2);
                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                            if (this.zzy != null) {
                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                            } else {
                                                                                this.zzy = new ArrayList(arrayList);
                                                                            }
                                                                            this.zzk.zzd.zzb(j110);
                                                                            strZzx = CallerData.NA;
                                                                            if (size > 0) {
                                                                                strZzx = zzfzVarZza.zzb(0).zzx();
                                                                            }
                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv8.length), strZzm);
                                                                            this.zzu = true;
                                                                            zzeu zzeuVar8 = this.zzd;
                                                                            zzal(zzeuVar8);
                                                                            zzkq zzkqVar7 = new zzkq(this, strZzr);
                                                                            zzeuVar8.zzg();
                                                                            zzeuVar8.zzW();
                                                                            Preconditions.checkNotNull(url7);
                                                                            Preconditions.checkNotNull(bArrZzbv8);
                                                                            Preconditions.checkNotNull(zzkqVar7);
                                                                            zzeuVar8.zzs.zzaz().zzo(new zzet(zzeuVar8, strZzr, url7, bArrZzbv8, null, zzkqVar7));
                                                                        } else {
                                                                            objZza = zzeb.zzp.zza(null);
                                                                        }
                                                                        string2 = (String) objZza;
                                                                        URL url8 = new URL(string2);
                                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                                        if (this.zzy != null) {
                                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                        } else {
                                                                            this.zzy = new ArrayList(arrayList);
                                                                        }
                                                                        this.zzk.zzd.zzb(j110);
                                                                        strZzx = CallerData.NA;
                                                                        if (size > 0) {
                                                                            strZzx = zzfzVarZza.zzb(0).zzx();
                                                                        }
                                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv8.length), strZzm);
                                                                        this.zzu = true;
                                                                        zzeu zzeuVar9 = this.zzd;
                                                                        zzal(zzeuVar9);
                                                                        zzkq zzkqVar8 = new zzkq(this, strZzr);
                                                                        zzeuVar9.zzg();
                                                                        zzeuVar9.zzW();
                                                                        Preconditions.checkNotNull(url8);
                                                                        Preconditions.checkNotNull(bArrZzbv8);
                                                                        Preconditions.checkNotNull(zzkqVar8);
                                                                        zzeuVar9.zzs.zzaz().zzo(new zzet(zzeuVar9, strZzr, url8, bArrZzbv8, null, zzkqVar8));
                                                                    } else {
                                                                        zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                        size = listEmptyList.size();
                                                                        arrayList = new ArrayList(listEmptyList.size());
                                                                        if (zzg().zzt(strZzr)) {
                                                                            z13 = false;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                        zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                        zzoz.zzc();
                                                                        zZzs = zzg().zzs(null, zzeb.zzar);
                                                                        i10 = 0;
                                                                        while (i10 < size) {
                                                                            zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                                            arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                            zzg().zzh();
                                                                            zzgbVar.zzal(73000L);
                                                                            long j111 = j10;
                                                                            zzgbVar.zzak(j111);
                                                                            this.zzn.zzaw();
                                                                            zzgbVar.zzag(false);
                                                                            if (!z13) {
                                                                                zzgbVar.zzq();
                                                                            }
                                                                            if (!zZzi) {
                                                                                zzgbVar.zzx();
                                                                                zzgbVar.zzt();
                                                                            }
                                                                            if (!zZzi2) {
                                                                                zzgbVar.zzn();
                                                                            }
                                                                            zzC(strZzr, zzgbVar);
                                                                            if (!zZzs) {
                                                                                zzgbVar.zzy();
                                                                            }
                                                                            if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                                byte[] bArrZzbv9 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                                zzlb zzlbVar10 = this.zzi;
                                                                                zzal(zzlbVar10);
                                                                                zzgbVar.zzJ(zzlbVar10.zzd(bArrZzbv9));
                                                                            }
                                                                            zzfzVarZza.zza(zzgbVar);
                                                                            i10++;
                                                                            j10 = j111;
                                                                        }
                                                                        long j112 = j10;
                                                                        if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                            zzlb zzlbVar11 = this.zzi;
                                                                            zzal(zzlbVar11);
                                                                            strZzm = zzlbVar11.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                        } else {
                                                                            strZzm = null;
                                                                        }
                                                                        zzal(this.zzi);
                                                                        byte[] bArrZzbv10 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                        zzkoVar = this.zzl;
                                                                        zzow.zzc();
                                                                        if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                            zzfp zzfpVar5 = zzkoVar.zzf.zzc;
                                                                            zzal(zzfpVar5);
                                                                            strZzi = zzfpVar5.zzi(strZzr);
                                                                            if (TextUtils.isEmpty(strZzi)) {
                                                                                Uri uri5 = Uri.parse((String) zzeb.zzp.zza(null));
                                                                                Uri.Builder builderBuildUpon5 = uri5.buildUpon();
                                                                                builderBuildUpon5.authority(strZzi + "." + uri5.getAuthority());
                                                                                string2 = builderBuildUpon5.build().toString();
                                                                            } else {
                                                                                objZza = zzeb.zzp.zza(null);
                                                                            }
                                                                            URL url9 = new URL(string2);
                                                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                                                            if (this.zzy != null) {
                                                                                zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                            } else {
                                                                                this.zzy = new ArrayList(arrayList);
                                                                            }
                                                                            this.zzk.zzd.zzb(j112);
                                                                            strZzx = CallerData.NA;
                                                                            if (size > 0) {
                                                                                strZzx = zzfzVarZza.zzb(0).zzx();
                                                                            }
                                                                            zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv10.length), strZzm);
                                                                            this.zzu = true;
                                                                            zzeu zzeuVar10 = this.zzd;
                                                                            zzal(zzeuVar10);
                                                                            zzkq zzkqVar9 = new zzkq(this, strZzr);
                                                                            zzeuVar10.zzg();
                                                                            zzeuVar10.zzW();
                                                                            Preconditions.checkNotNull(url9);
                                                                            Preconditions.checkNotNull(bArrZzbv10);
                                                                            Preconditions.checkNotNull(zzkqVar9);
                                                                            zzeuVar10.zzs.zzaz().zzo(new zzet(zzeuVar10, strZzr, url9, bArrZzbv10, null, zzkqVar9));
                                                                        } else {
                                                                            objZza = zzeb.zzp.zza(null);
                                                                        }
                                                                        string2 = (String) objZza;
                                                                        URL url10 = new URL(string2);
                                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                                        if (this.zzy != null) {
                                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                        } else {
                                                                            this.zzy = new ArrayList(arrayList);
                                                                        }
                                                                        this.zzk.zzd.zzb(j112);
                                                                        strZzx = CallerData.NA;
                                                                        if (size > 0) {
                                                                            strZzx = zzfzVarZza.zzb(0).zzx();
                                                                        }
                                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv10.length), strZzm);
                                                                        this.zzu = true;
                                                                        zzeu zzeuVar11 = this.zzd;
                                                                        zzal(zzeuVar11);
                                                                        zzkq zzkqVar10 = new zzkq(this, strZzr);
                                                                        zzeuVar11.zzg();
                                                                        zzeuVar11.zzW();
                                                                        Preconditions.checkNotNull(url10);
                                                                        Preconditions.checkNotNull(bArrZzbv10);
                                                                        Preconditions.checkNotNull(zzkqVar10);
                                                                        zzeuVar11.zzs.zzaz().zzo(new zzet(zzeuVar11, strZzr, url10, bArrZzbv10, null, zzkqVar10));
                                                                    }
                                                                } else {
                                                                    zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                                    size = listEmptyList.size();
                                                                    arrayList = new ArrayList(listEmptyList.size());
                                                                    if (zzg().zzt(strZzr)) {
                                                                        z13 = false;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                                    zzoz.zzc();
                                                                    zZzs = zzg().zzs(null, zzeb.zzar);
                                                                    i10 = 0;
                                                                    while (i10 < size) {
                                                                        zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                                        arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                                        zzg().zzh();
                                                                        zzgbVar.zzal(73000L);
                                                                        long j113 = j10;
                                                                        zzgbVar.zzak(j113);
                                                                        this.zzn.zzaw();
                                                                        zzgbVar.zzag(false);
                                                                        if (!z13) {
                                                                            zzgbVar.zzq();
                                                                        }
                                                                        if (!zZzi) {
                                                                            zzgbVar.zzx();
                                                                            zzgbVar.zzt();
                                                                        }
                                                                        if (!zZzi2) {
                                                                            zzgbVar.zzn();
                                                                        }
                                                                        zzC(strZzr, zzgbVar);
                                                                        if (!zZzs) {
                                                                            zzgbVar.zzy();
                                                                        }
                                                                        if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                                            byte[] bArrZzbv11 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                                            zzlb zzlbVar12 = this.zzi;
                                                                            zzal(zzlbVar12);
                                                                            zzgbVar.zzJ(zzlbVar12.zzd(bArrZzbv11));
                                                                        }
                                                                        zzfzVarZza.zza(zzgbVar);
                                                                        i10++;
                                                                        j10 = j113;
                                                                    }
                                                                    long j114 = j10;
                                                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                                                        zzlb zzlbVar13 = this.zzi;
                                                                        zzal(zzlbVar13);
                                                                        strZzm = zzlbVar13.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                                    } else {
                                                                        strZzm = null;
                                                                    }
                                                                    zzal(this.zzi);
                                                                    byte[] bArrZzbv12 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                                    zzkoVar = this.zzl;
                                                                    zzow.zzc();
                                                                    if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                                        zzfp zzfpVar6 = zzkoVar.zzf.zzc;
                                                                        zzal(zzfpVar6);
                                                                        strZzi = zzfpVar6.zzi(strZzr);
                                                                        if (TextUtils.isEmpty(strZzi)) {
                                                                            Uri uri6 = Uri.parse((String) zzeb.zzp.zza(null));
                                                                            Uri.Builder builderBuildUpon6 = uri6.buildUpon();
                                                                            builderBuildUpon6.authority(strZzi + "." + uri6.getAuthority());
                                                                            string2 = builderBuildUpon6.build().toString();
                                                                        } else {
                                                                            objZza = zzeb.zzp.zza(null);
                                                                        }
                                                                        URL url11 = new URL(string2);
                                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                                        if (this.zzy != null) {
                                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                        } else {
                                                                            this.zzy = new ArrayList(arrayList);
                                                                        }
                                                                        this.zzk.zzd.zzb(j114);
                                                                        strZzx = CallerData.NA;
                                                                        if (size > 0) {
                                                                            strZzx = zzfzVarZza.zzb(0).zzx();
                                                                        }
                                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv12.length), strZzm);
                                                                        this.zzu = true;
                                                                        zzeu zzeuVar12 = this.zzd;
                                                                        zzal(zzeuVar12);
                                                                        zzkq zzkqVar11 = new zzkq(this, strZzr);
                                                                        zzeuVar12.zzg();
                                                                        zzeuVar12.zzW();
                                                                        Preconditions.checkNotNull(url11);
                                                                        Preconditions.checkNotNull(bArrZzbv12);
                                                                        Preconditions.checkNotNull(zzkqVar11);
                                                                        zzeuVar12.zzs.zzaz().zzo(new zzet(zzeuVar12, strZzr, url11, bArrZzbv12, null, zzkqVar11));
                                                                    } else {
                                                                        objZza = zzeb.zzp.zza(null);
                                                                    }
                                                                    string2 = (String) objZza;
                                                                    URL url12 = new URL(string2);
                                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                                    if (this.zzy != null) {
                                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                                    } else {
                                                                        this.zzy = new ArrayList(arrayList);
                                                                    }
                                                                    this.zzk.zzd.zzb(j114);
                                                                    strZzx = CallerData.NA;
                                                                    if (size > 0) {
                                                                        strZzx = zzfzVarZza.zzb(0).zzx();
                                                                    }
                                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv12.length), strZzm);
                                                                    this.zzu = true;
                                                                    zzeu zzeuVar13 = this.zzd;
                                                                    zzal(zzeuVar13);
                                                                    zzkq zzkqVar12 = new zzkq(this, strZzr);
                                                                    zzeuVar13.zzg();
                                                                    zzeuVar13.zzW();
                                                                    Preconditions.checkNotNull(url12);
                                                                    Preconditions.checkNotNull(bArrZzbv12);
                                                                    Preconditions.checkNotNull(zzkqVar12);
                                                                    zzeuVar13.zzs.zzaz().zzo(new zzet(zzeuVar13, strZzr, url12, bArrZzbv12, null, zzkqVar12));
                                                                }
                                                                zzae();
                                                            }
                                                            this.zzv = false;
                                                            zzae();
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor3 = cursorQuery;
                                                            if (cursor3 != null) {
                                                                cursor3.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor4 = cursorRawQuery2;
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e20) {
                                                e = e20;
                                                cursorRawQuery2 = null;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                if (cursor4 != null) {
                                                    cursor4.close();
                                                }
                                                throw th;
                                            }
                                            cursorRawQuery2.close();
                                            this.zzA = j12;
                                        }
                                        iZze = zzg().zze(strZzr, zzeb.zzf);
                                        iMax = Math.max(0, zzg().zze(strZzr, zzeb.zzg));
                                        zzamVar = this.zze;
                                        zzal(zzamVar);
                                        zzamVar.zzg();
                                        zzamVar.zzW();
                                        if (iZze > 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        Preconditions.checkArgument(z11);
                                        if (iMax > 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        Preconditions.checkArgument(z12);
                                        Preconditions.checkNotEmpty(strZzr);
                                        try {
                                            cursorQuery = zzamVar.zzh().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{strZzr}, null, null, "rowid", String.valueOf(iZze));
                                            if (cursorQuery.moveToFirst()) {
                                                listEmptyList = Collections.emptyList();
                                                cursorQuery.close();
                                                j10 = jCurrentTimeMillis;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                length = 0;
                                                while (true) {
                                                    j11 = cursorQuery.getLong(i14);
                                                    byte[] blob2 = cursorQuery.getBlob(i13);
                                                    zzlb zzlbVar14 = zzamVar.zzf.zzi;
                                                    zzal(zzlbVar14);
                                                    ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(blob2);
                                                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream2);
                                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                                    bArr = new byte[1024];
                                                    j10 = jCurrentTimeMillis;
                                                    while (true) {
                                                        i12 = gZIPInputStream.read(bArr);
                                                        if (i12 <= 0) {
                                                            break;
                                                            break;
                                                        }
                                                        byteArrayOutputStream.write(bArr, 0, i12);
                                                    }
                                                    gZIPInputStream.close();
                                                    byteArrayInputStream2.close();
                                                    byteArray = byteArrayOutputStream.toByteArray();
                                                    if (arrayList2.isEmpty() && byteArray.length + length > iMax) {
                                                        break;
                                                    }
                                                    zzgbVar2 = (com.google.android.gms.internal.measurement.zzgb) zzlb.zzl(com.google.android.gms.internal.measurement.zzgc.zzt(), byteArray);
                                                    if (!cursorQuery.isNull(2)) {
                                                        zzgbVar2.zzaf(cursorQuery.getInt(2));
                                                    }
                                                    length += byteArray.length;
                                                    arrayList2.add(Pair.create((com.google.android.gms.internal.measurement.zzgc) zzgbVar2.zzaE(), Long.valueOf(j11)));
                                                    if (cursorQuery.moveToNext() || length > iMax) {
                                                        break;
                                                        break;
                                                    } else {
                                                        jCurrentTimeMillis = j10;
                                                        i13 = 1;
                                                        i14 = 0;
                                                    }
                                                }
                                                cursorQuery.close();
                                                listEmptyList = arrayList2;
                                            }
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            j10 = jCurrentTimeMillis;
                                            cursorQuery = null;
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor3 = null;
                                        }
                                        if (!listEmptyList.isEmpty()) {
                                            if (zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                it = listEmptyList.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        strZzJ = null;
                                                        break;
                                                    }
                                                    zzgcVar2 = (com.google.android.gms.internal.measurement.zzgc) ((Pair) it.next()).first;
                                                    if (!zzgcVar2.zzJ().isEmpty()) {
                                                        strZzJ = zzgcVar2.zzJ();
                                                        break;
                                                    }
                                                }
                                                if (strZzJ != null) {
                                                    while (i11 < listEmptyList.size()) {
                                                        zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i11)).first;
                                                        if (zzgcVar.zzJ().isEmpty() && !zzgcVar.zzJ().equals(strZzJ)) {
                                                            listEmptyList = listEmptyList.subList(0, i11);
                                                            break;
                                                        }
                                                    }
                                                    zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                    size = listEmptyList.size();
                                                    arrayList = new ArrayList(listEmptyList.size());
                                                    if (zzg().zzt(strZzr) || !zzh(strZzr).zzi(zzah.AD_STORAGE)) {
                                                        z13 = false;
                                                    } else {
                                                        z13 = true;
                                                    }
                                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                    zzoz.zzc();
                                                    zZzs = zzg().zzs(null, zzeb.zzar);
                                                    i10 = 0;
                                                    while (i10 < size) {
                                                        zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                        arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                        zzg().zzh();
                                                        zzgbVar.zzal(73000L);
                                                        long j115 = j10;
                                                        zzgbVar.zzak(j115);
                                                        this.zzn.zzaw();
                                                        zzgbVar.zzag(false);
                                                        if (!z13) {
                                                            zzgbVar.zzq();
                                                        }
                                                        if (!zZzi) {
                                                            zzgbVar.zzx();
                                                            zzgbVar.zzt();
                                                        }
                                                        if (!zZzi2) {
                                                            zzgbVar.zzn();
                                                        }
                                                        zzC(strZzr, zzgbVar);
                                                        if (!zZzs) {
                                                            zzgbVar.zzy();
                                                        }
                                                        if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                            byte[] bArrZzbv13 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                            zzlb zzlbVar15 = this.zzi;
                                                            zzal(zzlbVar15);
                                                            zzgbVar.zzJ(zzlbVar15.zzd(bArrZzbv13));
                                                        }
                                                        zzfzVarZza.zza(zzgbVar);
                                                        i10++;
                                                        j10 = j115;
                                                    }
                                                    long j116 = j10;
                                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                                        zzlb zzlbVar16 = this.zzi;
                                                        zzal(zzlbVar16);
                                                        strZzm = zzlbVar16.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                    } else {
                                                        strZzm = null;
                                                    }
                                                    zzal(this.zzi);
                                                    byte[] bArrZzbv14 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                    zzkoVar = this.zzl;
                                                    zzow.zzc();
                                                    if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                        zzfp zzfpVar7 = zzkoVar.zzf.zzc;
                                                        zzal(zzfpVar7);
                                                        strZzi = zzfpVar7.zzi(strZzr);
                                                        if (TextUtils.isEmpty(strZzi)) {
                                                            Uri uri7 = Uri.parse((String) zzeb.zzp.zza(null));
                                                            Uri.Builder builderBuildUpon7 = uri7.buildUpon();
                                                            builderBuildUpon7.authority(strZzi + "." + uri7.getAuthority());
                                                            string2 = builderBuildUpon7.build().toString();
                                                        } else {
                                                            objZza = zzeb.zzp.zza(null);
                                                        }
                                                        URL url13 = new URL(string2);
                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                        if (this.zzy != null) {
                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                        } else {
                                                            this.zzy = new ArrayList(arrayList);
                                                        }
                                                        this.zzk.zzd.zzb(j116);
                                                        strZzx = CallerData.NA;
                                                        if (size > 0) {
                                                            strZzx = zzfzVarZza.zzb(0).zzx();
                                                        }
                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv14.length), strZzm);
                                                        this.zzu = true;
                                                        zzeu zzeuVar14 = this.zzd;
                                                        zzal(zzeuVar14);
                                                        zzkq zzkqVar13 = new zzkq(this, strZzr);
                                                        zzeuVar14.zzg();
                                                        zzeuVar14.zzW();
                                                        Preconditions.checkNotNull(url13);
                                                        Preconditions.checkNotNull(bArrZzbv14);
                                                        Preconditions.checkNotNull(zzkqVar13);
                                                        zzeuVar14.zzs.zzaz().zzo(new zzet(zzeuVar14, strZzr, url13, bArrZzbv14, null, zzkqVar13));
                                                    } else {
                                                        objZza = zzeb.zzp.zza(null);
                                                    }
                                                    string2 = (String) objZza;
                                                    URL url14 = new URL(string2);
                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                    if (this.zzy != null) {
                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                    } else {
                                                        this.zzy = new ArrayList(arrayList);
                                                    }
                                                    this.zzk.zzd.zzb(j116);
                                                    strZzx = CallerData.NA;
                                                    if (size > 0) {
                                                        strZzx = zzfzVarZza.zzb(0).zzx();
                                                    }
                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv14.length), strZzm);
                                                    this.zzu = true;
                                                    zzeu zzeuVar15 = this.zzd;
                                                    zzal(zzeuVar15);
                                                    zzkq zzkqVar14 = new zzkq(this, strZzr);
                                                    zzeuVar15.zzg();
                                                    zzeuVar15.zzW();
                                                    Preconditions.checkNotNull(url14);
                                                    Preconditions.checkNotNull(bArrZzbv14);
                                                    Preconditions.checkNotNull(zzkqVar14);
                                                    zzeuVar15.zzs.zzaz().zzo(new zzet(zzeuVar15, strZzr, url14, bArrZzbv14, null, zzkqVar14));
                                                } else {
                                                    zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                    size = listEmptyList.size();
                                                    arrayList = new ArrayList(listEmptyList.size());
                                                    if (zzg().zzt(strZzr)) {
                                                        z13 = false;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                    zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                    zzoz.zzc();
                                                    zZzs = zzg().zzs(null, zzeb.zzar);
                                                    i10 = 0;
                                                    while (i10 < size) {
                                                        zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                        arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                        zzg().zzh();
                                                        zzgbVar.zzal(73000L);
                                                        long j117 = j10;
                                                        zzgbVar.zzak(j117);
                                                        this.zzn.zzaw();
                                                        zzgbVar.zzag(false);
                                                        if (!z13) {
                                                            zzgbVar.zzq();
                                                        }
                                                        if (!zZzi) {
                                                            zzgbVar.zzx();
                                                            zzgbVar.zzt();
                                                        }
                                                        if (!zZzi2) {
                                                            zzgbVar.zzn();
                                                        }
                                                        zzC(strZzr, zzgbVar);
                                                        if (!zZzs) {
                                                            zzgbVar.zzy();
                                                        }
                                                        if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                            byte[] bArrZzbv15 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                            zzlb zzlbVar17 = this.zzi;
                                                            zzal(zzlbVar17);
                                                            zzgbVar.zzJ(zzlbVar17.zzd(bArrZzbv15));
                                                        }
                                                        zzfzVarZza.zza(zzgbVar);
                                                        i10++;
                                                        j10 = j117;
                                                    }
                                                    long j118 = j10;
                                                    if (Log.isLoggable(zzay().zzq(), 2)) {
                                                        zzlb zzlbVar18 = this.zzi;
                                                        zzal(zzlbVar18);
                                                        strZzm = zzlbVar18.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                    } else {
                                                        strZzm = null;
                                                    }
                                                    zzal(this.zzi);
                                                    byte[] bArrZzbv16 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                    zzkoVar = this.zzl;
                                                    zzow.zzc();
                                                    if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                        zzfp zzfpVar8 = zzkoVar.zzf.zzc;
                                                        zzal(zzfpVar8);
                                                        strZzi = zzfpVar8.zzi(strZzr);
                                                        if (TextUtils.isEmpty(strZzi)) {
                                                            Uri uri8 = Uri.parse((String) zzeb.zzp.zza(null));
                                                            Uri.Builder builderBuildUpon8 = uri8.buildUpon();
                                                            builderBuildUpon8.authority(strZzi + "." + uri8.getAuthority());
                                                            string2 = builderBuildUpon8.build().toString();
                                                        } else {
                                                            objZza = zzeb.zzp.zza(null);
                                                        }
                                                        URL url15 = new URL(string2);
                                                        Preconditions.checkArgument(!arrayList.isEmpty());
                                                        if (this.zzy != null) {
                                                            zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                        } else {
                                                            this.zzy = new ArrayList(arrayList);
                                                        }
                                                        this.zzk.zzd.zzb(j118);
                                                        strZzx = CallerData.NA;
                                                        if (size > 0) {
                                                            strZzx = zzfzVarZza.zzb(0).zzx();
                                                        }
                                                        zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv16.length), strZzm);
                                                        this.zzu = true;
                                                        zzeu zzeuVar16 = this.zzd;
                                                        zzal(zzeuVar16);
                                                        zzkq zzkqVar15 = new zzkq(this, strZzr);
                                                        zzeuVar16.zzg();
                                                        zzeuVar16.zzW();
                                                        Preconditions.checkNotNull(url15);
                                                        Preconditions.checkNotNull(bArrZzbv16);
                                                        Preconditions.checkNotNull(zzkqVar15);
                                                        zzeuVar16.zzs.zzaz().zzo(new zzet(zzeuVar16, strZzr, url15, bArrZzbv16, null, zzkqVar15));
                                                    } else {
                                                        objZza = zzeb.zzp.zza(null);
                                                    }
                                                    string2 = (String) objZza;
                                                    URL url16 = new URL(string2);
                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                    if (this.zzy != null) {
                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                    } else {
                                                        this.zzy = new ArrayList(arrayList);
                                                    }
                                                    this.zzk.zzd.zzb(j118);
                                                    strZzx = CallerData.NA;
                                                    if (size > 0) {
                                                        strZzx = zzfzVarZza.zzb(0).zzx();
                                                    }
                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv16.length), strZzm);
                                                    this.zzu = true;
                                                    zzeu zzeuVar17 = this.zzd;
                                                    zzal(zzeuVar17);
                                                    zzkq zzkqVar16 = new zzkq(this, strZzr);
                                                    zzeuVar17.zzg();
                                                    zzeuVar17.zzW();
                                                    Preconditions.checkNotNull(url16);
                                                    Preconditions.checkNotNull(bArrZzbv16);
                                                    Preconditions.checkNotNull(zzkqVar16);
                                                    zzeuVar17.zzs.zzaz().zzo(new zzet(zzeuVar17, strZzr, url16, bArrZzbv16, null, zzkqVar16));
                                                }
                                            } else {
                                                zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
                                                size = listEmptyList.size();
                                                arrayList = new ArrayList(listEmptyList.size());
                                                if (zzg().zzt(strZzr)) {
                                                    z13 = false;
                                                } else {
                                                    z13 = false;
                                                }
                                                zZzi = zzh(strZzr).zzi(zzah.AD_STORAGE);
                                                zZzi2 = zzh(strZzr).zzi(zzah.ANALYTICS_STORAGE);
                                                zzoz.zzc();
                                                zZzs = zzg().zzs(null, zzeb.zzar);
                                                i10 = 0;
                                                while (i10 < size) {
                                                    zzgbVar = (com.google.android.gms.internal.measurement.zzgb) ((com.google.android.gms.internal.measurement.zzgc) ((Pair) listEmptyList.get(i10)).first).zzby();
                                                    arrayList.add((Long) ((Pair) listEmptyList.get(i10)).second);
                                                    zzg().zzh();
                                                    zzgbVar.zzal(73000L);
                                                    long j119 = j10;
                                                    zzgbVar.zzak(j119);
                                                    this.zzn.zzaw();
                                                    zzgbVar.zzag(false);
                                                    if (!z13) {
                                                        zzgbVar.zzq();
                                                    }
                                                    if (!zZzi) {
                                                        zzgbVar.zzx();
                                                        zzgbVar.zzt();
                                                    }
                                                    if (!zZzi2) {
                                                        zzgbVar.zzn();
                                                    }
                                                    zzC(strZzr, zzgbVar);
                                                    if (!zZzs) {
                                                        zzgbVar.zzy();
                                                    }
                                                    if (zzg().zzs(strZzr, zzeb.zzT)) {
                                                        byte[] bArrZzbv17 = ((com.google.android.gms.internal.measurement.zzgc) zzgbVar.zzaE()).zzbv();
                                                        zzlb zzlbVar19 = this.zzi;
                                                        zzal(zzlbVar19);
                                                        zzgbVar.zzJ(zzlbVar19.zzd(bArrZzbv17));
                                                    }
                                                    zzfzVarZza.zza(zzgbVar);
                                                    i10++;
                                                    j10 = j119;
                                                }
                                                long j1110 = j10;
                                                if (Log.isLoggable(zzay().zzq(), 2)) {
                                                    zzlb zzlbVar110 = this.zzi;
                                                    zzal(zzlbVar110);
                                                    strZzm = zzlbVar110.zzm((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE());
                                                } else {
                                                    strZzm = null;
                                                }
                                                zzal(this.zzi);
                                                byte[] bArrZzbv18 = ((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv();
                                                zzkoVar = this.zzl;
                                                zzow.zzc();
                                                if (zzkoVar.zzs.zzf().zzs(strZzr, zzeb.zzan)) {
                                                    zzfp zzfpVar9 = zzkoVar.zzf.zzc;
                                                    zzal(zzfpVar9);
                                                    strZzi = zzfpVar9.zzi(strZzr);
                                                    if (TextUtils.isEmpty(strZzi)) {
                                                        Uri uri9 = Uri.parse((String) zzeb.zzp.zza(null));
                                                        Uri.Builder builderBuildUpon9 = uri9.buildUpon();
                                                        builderBuildUpon9.authority(strZzi + "." + uri9.getAuthority());
                                                        string2 = builderBuildUpon9.build().toString();
                                                    } else {
                                                        objZza = zzeb.zzp.zza(null);
                                                    }
                                                    URL url17 = new URL(string2);
                                                    Preconditions.checkArgument(!arrayList.isEmpty());
                                                    if (this.zzy != null) {
                                                        zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                    } else {
                                                        this.zzy = new ArrayList(arrayList);
                                                    }
                                                    this.zzk.zzd.zzb(j1110);
                                                    strZzx = CallerData.NA;
                                                    if (size > 0) {
                                                        strZzx = zzfzVarZza.zzb(0).zzx();
                                                    }
                                                    zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv18.length), strZzm);
                                                    this.zzu = true;
                                                    zzeu zzeuVar18 = this.zzd;
                                                    zzal(zzeuVar18);
                                                    zzkq zzkqVar17 = new zzkq(this, strZzr);
                                                    zzeuVar18.zzg();
                                                    zzeuVar18.zzW();
                                                    Preconditions.checkNotNull(url17);
                                                    Preconditions.checkNotNull(bArrZzbv18);
                                                    Preconditions.checkNotNull(zzkqVar17);
                                                    zzeuVar18.zzs.zzaz().zzo(new zzet(zzeuVar18, strZzr, url17, bArrZzbv18, null, zzkqVar17));
                                                } else {
                                                    objZza = zzeb.zzp.zza(null);
                                                }
                                                string2 = (String) objZza;
                                                URL url18 = new URL(string2);
                                                Preconditions.checkArgument(!arrayList.isEmpty());
                                                if (this.zzy != null) {
                                                    zzay().zzd().zza("Set uploading progress before finishing the previous upload");
                                                } else {
                                                    this.zzy = new ArrayList(arrayList);
                                                }
                                                this.zzk.zzd.zzb(j1110);
                                                strZzx = CallerData.NA;
                                                if (size > 0) {
                                                    strZzx = zzfzVarZza.zzb(0).zzx();
                                                }
                                                zzay().zzj().zzd("Uploading data. app, uncompressed size, data", strZzx, Integer.valueOf(bArrZzbv18.length), strZzm);
                                                this.zzu = true;
                                                zzeu zzeuVar19 = this.zzd;
                                                zzal(zzeuVar19);
                                                zzkq zzkqVar18 = new zzkq(this, strZzr);
                                                zzeuVar19.zzg();
                                                zzeuVar19.zzW();
                                                Preconditions.checkNotNull(url18);
                                                Preconditions.checkNotNull(bArrZzbv18);
                                                Preconditions.checkNotNull(zzkqVar18);
                                                zzeuVar19.zzs.zzaz().zzo(new zzet(zzeuVar19, strZzr, url18, bArrZzbv18, null, zzkqVar18));
                                            }
                                        }
                                    }
                                    this.zzv = false;
                                } catch (Throwable th9) {
                                    th = th9;
                                    z10 = false;
                                    this.zzv = z10;
                                    zzae();
                                    throw th;
                                }
                            } else {
                                zzay().zzj().zza("Network not connected, ignoring upload request");
                            }
                        }
                        zzae();
                    }
                    zzag();
                    this.zzv = false;
                    zzae();
                }
                zzemVarZzj = zzay().zzd();
                str2 = "Upload called in the client side when service should be used";
            }
            zzemVarZzj.zza(str2);
            this.zzv = false;
            zzae();
        } catch (Throwable th10) {
            th = th10;
            z10 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0318 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x036b A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0371 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0399 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x039b A[Catch: all -> 0x0a64, TRY_ENTER, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x03b2 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03b8 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x03f9 A[Catch: all -> 0x0a64, TRY_ENTER, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0416  */
    /* JADX WARN: Code duplicated, block: B:126:0x041a A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x045f A[Catch: all -> 0x0a64, TRY_ENTER, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x047d A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x04ff A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x053e A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x05b7 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0604 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0611 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x061e A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0648 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0659 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x069a A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:218:0x0739  */
    /* JADX WARN: Code duplicated, block: B:220:0x073c A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:231:0x0782 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:234:0x07ca A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x07d3 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x07e3 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x0803 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x086f A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:254:0x088f A[Catch: all -> 0x0a64, TRY_LEAVE, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0921 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x09cd A[Catch: SQLiteException -> 0x09e8, all -> 0x0a64, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x09e8, blocks: (B:271:0x09bd, B:273:0x09cd), top: B:295:0x09bd, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:324:0x092d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x092b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:? A[LOOP:2: B:259:0x091b->B:326:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x016b A[Catch: all -> 0x0a64, TRY_ENTER, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0182 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0192  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e6 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f4 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0205 A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x020b  */
    /* JADX WARN: Code duplicated, block: B:72:0x020c A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x023a A[Catch: all -> 0x0a64, TRY_LEAVE, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02be A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0308  */
    /* JADX WARN: Code duplicated, block: B:97:0x030b A[Catch: all -> 0x0a64, TryCatch #6 {all -> 0x0a64, blocks: (B:28:0x0124, B:31:0x0135, B:33:0x013f, B:38:0x014b, B:94:0x02f5, B:103:0x032b, B:105:0x036b, B:107:0x0371, B:108:0x0388, B:112:0x039b, B:114:0x03b2, B:116:0x03b8, B:117:0x03cf, B:122:0x03f9, B:126:0x041a, B:127:0x0431, B:130:0x0442, B:133:0x045f, B:134:0x0473, B:136:0x047d, B:138:0x048c, B:140:0x0492, B:141:0x049b, B:142:0x04a9, B:144:0x04be, B:146:0x04d3, B:158:0x04ff, B:159:0x0514, B:161:0x053e, B:164:0x0556, B:167:0x0599, B:169:0x05c5, B:171:0x0604, B:172:0x0609, B:174:0x0611, B:175:0x0616, B:177:0x061e, B:178:0x0623, B:180:0x0632, B:182:0x063a, B:183:0x063f, B:185:0x0648, B:186:0x064c, B:188:0x0659, B:189:0x065e, B:191:0x0685, B:193:0x068d, B:194:0x0692, B:196:0x069a, B:197:0x069d, B:199:0x06b5, B:202:0x06bd, B:203:0x06d6, B:205:0x06dc, B:207:0x06f0, B:209:0x06fc, B:211:0x0709, B:215:0x0723, B:216:0x0733, B:220:0x073c, B:221:0x073f, B:223:0x075d, B:225:0x0761, B:227:0x0773, B:229:0x0777, B:231:0x0782, B:232:0x078b, B:234:0x07ca, B:236:0x07d3, B:237:0x07d6, B:239:0x07e3, B:241:0x0803, B:242:0x0810, B:243:0x0846, B:245:0x084e, B:247:0x0858, B:248:0x0865, B:250:0x086f, B:251:0x087c, B:252:0x0889, B:254:0x088f, B:256:0x08bf, B:257:0x0905, B:258:0x090f, B:259:0x091b, B:261:0x0921, B:270:0x096f, B:271:0x09bd, B:273:0x09cd, B:287:0x0a31, B:276:0x09e5, B:278:0x09e9, B:264:0x092d, B:266:0x0959, B:282:0x0a02, B:283:0x0a19, B:286:0x0a1c, B:168:0x05b7, B:155:0x04e4, B:97:0x030b, B:98:0x0312, B:100:0x0318, B:102:0x0324, B:44:0x015f, B:47:0x016b, B:49:0x0182, B:55:0x01a0, B:63:0x01e0, B:65:0x01e6, B:67:0x01f4, B:69:0x0205, B:72:0x020c, B:90:0x02b3, B:92:0x02be, B:73:0x023a, B:74:0x0257, B:76:0x025e, B:78:0x026f, B:89:0x0297, B:88:0x0284, B:58:0x01ae, B:62:0x01d6), top: B:306:0x0124, inners: #0, #2, #5 }] */
    public final void zzY(zzaw zzawVar, zzq zzqVar) {
        String strZzg;
        long jLongValue;
        String str;
        String upperCase;
        String strConcat;
        zzle zzleVarZzp;
        String str2;
        zzam zzamVar;
        String str3;
        zzle zzleVar;
        zzam zzamVar2;
        Object obj;
        double dDoubleValue;
        boolean zZzai;
        boolean zEquals;
        zzau zzauVar;
        zzat zzatVar;
        long length;
        Object objZzf;
        zzak zzakVarZzm;
        long jIntValue;
        Bundle bundleZzc;
        zzam zzamVar3;
        String str4;
        int i10;
        long jDelete;
        zzar zzarVar;
        int i11;
        String str5;
        zzas zzasVarZzn;
        zzas zzasVarZzc;
        com.google.android.gms.internal.measurement.zzgb zzgbVarZzt;
        long j10;
        long j11;
        Map mapZzc;
        ArrayList arrayList;
        zzai zzaiVarZzc;
        zzah zzahVar;
        zzh zzhVarZzj;
        List listZzu;
        int i12;
        zzam zzamVar4;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        zzam zzamVar5;
        zzat zzatVar2;
        boolean zZzq;
        int i13;
        ContentValues contentValues;
        Pair pairZzd;
        Object obj2;
        zzam zzamVar6;
        zzle zzleVarZzp2;
        long jMax;
        long jIntValue2;
        String str6 = "metadata_fingerprint";
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        long jNanoTime = System.nanoTime();
        zzaz().zzg();
        zzB();
        String str7 = zzqVar.zza;
        zzal(this.zzi);
        if (zzlb.zzA(zzawVar, zzqVar)) {
            if (!zzqVar.zzh) {
                zzd(zzqVar);
                return;
            }
            zzfp zzfpVar = this.zzc;
            zzal(zzfpVar);
            String str8 = "_err";
            if (zzfpVar.zzr(str7, zzawVar.zza)) {
                zzay().zzk().zzc("Dropping blocked event. appId", zzeo.zzn(str7), this.zzn.zzj().zzd(zzawVar.zza));
                zzfp zzfpVar2 = this.zzc;
                zzal(zzfpVar2);
                if (!zzfpVar2.zzp(str7)) {
                    zzfp zzfpVar3 = this.zzc;
                    zzal(zzfpVar3);
                    if (!zzfpVar3.zzs(str7)) {
                        if ("_err".equals(zzawVar.zza)) {
                            return;
                        }
                        zzv().zzN(this.zzF, str7, 11, "_ev", zzawVar.zza, 0);
                        return;
                    }
                }
                zzam zzamVar7 = this.zze;
                zzal(zzamVar7);
                zzh zzhVarZzj2 = zzamVar7.zzj(str7);
                if (zzhVarZzj2 != null) {
                    long jAbs = Math.abs(zzav().currentTimeMillis() - Math.max(zzhVarZzj2.zzl(), zzhVarZzj2.zzc()));
                    zzg();
                    if (jAbs > ((Long) zzeb.zzy.zza(null)).longValue()) {
                        zzay().zzc().zza("Fetching config for blocked app");
                        zzD(zzhVarZzj2);
                        return;
                    }
                    return;
                }
                return;
            }
            zzep zzepVarZzb = zzep.zzb(zzawVar);
            zzv().zzM(zzepVarZzb, zzg().zzd(str7));
            zzaw zzawVarZza = zzepVarZzb.zza();
            if (Log.isLoggable(zzay().zzq(), 2)) {
                zzay().zzj().zzb("Logging event", this.zzn.zzj().zzc(zzawVarZza));
            }
            zzam zzamVar8 = this.zze;
            zzal(zzamVar8);
            zzamVar8.zzw();
            try {
                zzd(zzqVar);
                boolean z10 = "ecommerce_purchase".equals(zzawVarZza.zza) || "purchase".equals(zzawVarZza.zza) || "refund".equals(zzawVarZza.zza);
                if ("_iap".equals(zzawVarZza.zza)) {
                    strZzg = zzawVarZza.zzb.zzg(AppLovinEventParameters.REVENUE_CURRENCY);
                    if (z10) {
                        dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = zzawVarZza.zzb.zze("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue <= 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
                            zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeo.zzn(str7), Double.valueOf(dDoubleValue));
                            zzam zzamVar9 = this.zze;
                            zzal(zzamVar9);
                            zzamVar9.zzC();
                            zzam zzamVar10 = this.zze;
                            zzal(zzamVar10);
                            zzamVar10.zzx();
                            return;
                        }
                        jLongValue = Math.round(dDoubleValue);
                        if ("refund".equals(zzawVarZza.zza)) {
                            jLongValue = -jLongValue;
                        }
                    } else {
                        str8 = "_err";
                        jLongValue = zzawVarZza.zzb.zze("value").longValue();
                    }
                    if (!TextUtils.isEmpty(strZzg)) {
                        upperCase = strZzg.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            strConcat = "_ltv_".concat(upperCase);
                            zzam zzamVar11 = this.zze;
                            zzal(zzamVar11);
                            zzleVarZzp = zzamVar11.zzp(str7, strConcat);
                            if (zzleVarZzp != null) {
                                obj = zzleVarZzp.zze;
                                if (obj instanceof Long) {
                                    str6 = "metadata_fingerprint";
                                    str = str8;
                                    zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                } else {
                                    str2 = str8;
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    int iZze = zzg().zze(str7, zzeb.zzD) - 1;
                                    Preconditions.checkNotEmpty(str7);
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                    try {
                                        SQLiteDatabase sQLiteDatabaseZzh = zzamVar.zzh();
                                        str3 = str2;
                                        try {
                                            String[] strArr = new String[3];
                                            strArr[0] = str7;
                                            strArr[1] = str7;
                                            str6 = "metadata_fingerprint";
                                            try {
                                                strArr[2] = String.valueOf(iZze);
                                                sQLiteDatabaseZzh.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr);
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                zzamVar.zzs.zzay().zzd().zzc("Error pruning currencies. appId", zzeo.zzn(str7), e);
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            zzamVar.zzs.zzay().zzd().zzc("Error pruning currencies. appId", zzeo.zzn(str7), e);
                                            str = str3;
                                            zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                            zzamVar2 = this.zze;
                                            zzal(zzamVar2);
                                            if (!zzamVar2.zzL(zzleVar)) {
                                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeo.zzn(str7), this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                                                zzv().zzN(this.zzF, str7, 9, null, null, 0);
                                            }
                                            zZzai = zzlh.zzai(zzawVarZza.zza);
                                            zEquals = str.equals(zzawVarZza.zza);
                                            zzv();
                                            zzauVar = zzawVarZza.zzb;
                                            if (zzauVar == null) {
                                                length = 0;
                                            } else {
                                                zzatVar = new zzat(zzauVar);
                                                length = 0;
                                                while (zzatVar.hasNext()) {
                                                    objZzf = zzauVar.zzf(zzatVar.next());
                                                    if (objZzf instanceof Parcelable[]) {
                                                        length += (long) ((Parcelable[]) objZzf).length;
                                                    }
                                                }
                                            }
                                            zzam zzamVar12 = this.zze;
                                            zzal(zzamVar12);
                                            zzakVarZzm = zzamVar12.zzm(zza(), str7, length + 1, true, zZzai, false, zEquals, false);
                                            long j12 = zzakVarZzm.zzb;
                                            zzg();
                                            jIntValue = j12 - ((long) ((Integer) zzeb.zzj.zza(null)).intValue());
                                            if (jIntValue > 0) {
                                                if (jIntValue % 1000 == 1) {
                                                    zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeo.zzn(str7), Long.valueOf(zzakVarZzm.zzb));
                                                }
                                                zzam zzamVar13 = this.zze;
                                                zzal(zzamVar13);
                                                zzamVar13.zzC();
                                                zzam zzamVar14 = this.zze;
                                                zzal(zzamVar14);
                                                zzamVar14.zzx();
                                                return;
                                            }
                                            if (zZzai) {
                                                long j13 = zzakVarZzm.zza;
                                                zzg();
                                                jIntValue2 = j13 - ((long) ((Integer) zzeb.zzl.zza(null)).intValue());
                                                if (jIntValue2 > 0) {
                                                    if (jIntValue2 % 1000 == 1) {
                                                        zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeo.zzn(str7), Long.valueOf(zzakVarZzm.zza));
                                                    }
                                                    zzv().zzN(this.zzF, str7, 16, "_ev", zzawVarZza.zza, 0);
                                                    zzam zzamVar15 = this.zze;
                                                    zzal(zzamVar15);
                                                    zzamVar15.zzC();
                                                    zzam zzamVar16 = this.zze;
                                                    zzal(zzamVar16);
                                                    zzamVar16.zzx();
                                                    return;
                                                }
                                            }
                                            if (zEquals) {
                                                jMax = zzakVarZzm.zzd - ((long) Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzeb.zzk))));
                                                if (jMax > 0) {
                                                    if (jMax == 1) {
                                                        zzay().zzd().zzc("Too many error events logged. appId, count", zzeo.zzn(str7), Long.valueOf(zzakVarZzm.zzd));
                                                    }
                                                    zzam zzamVar17 = this.zze;
                                                    zzal(zzamVar17);
                                                    zzamVar17.zzC();
                                                    zzam zzamVar18 = this.zze;
                                                    zzal(zzamVar18);
                                                    zzamVar18.zzx();
                                                    return;
                                                }
                                            }
                                            bundleZzc = zzawVarZza.zzb.zzc();
                                            zzv().zzO(bundleZzc, "_o", zzawVarZza.zzc);
                                            if (zzv().zzae(str7)) {
                                                zzv().zzO(bundleZzc, "_dbg", 1L);
                                                zzv().zzO(bundleZzc, "_r", 1L);
                                            }
                                            if ("_s".equals(zzawVarZza.zza)) {
                                                zzam zzamVar19 = this.zze;
                                                zzal(zzamVar19);
                                                zzleVarZzp2 = zzamVar19.zzp(zzqVar.zza, "_sno");
                                                if (zzleVarZzp2 != null) {
                                                    zzv().zzO(bundleZzc, "_sno", zzleVarZzp2.zze);
                                                }
                                            }
                                            zzamVar3 = this.zze;
                                            zzal(zzamVar3);
                                            Preconditions.checkNotEmpty(str7);
                                            zzamVar3.zzg();
                                            zzamVar3.zzW();
                                            try {
                                                try {
                                                    try {
                                                        i10 = 0;
                                                        try {
                                                            str4 = "raw_events";
                                                            try {
                                                                jDelete = zzamVar3.zzh().delete(str4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str7, String.valueOf(Math.max(0, Math.min(1000000, zzamVar3.zzs.zzf().zze(str7, zzeb.zzo))))});
                                                                while (true) {
                                                                    if (zzatVar2.hasNext()) {
                                                                        zzfp zzfpVar4 = this.zzc;
                                                                        zzal(zzfpVar4);
                                                                        zZzq = zzfpVar4.zzq(zzarVar.zza, zzarVar.zzb);
                                                                        zzam zzamVar20 = this.zze;
                                                                        zzal(zzamVar20);
                                                                        zzak zzakVarZzl = zzamVar20.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                                                                        if (zZzq) {
                                                                        }
                                                                        i13 = i11;
                                                                        break;
                                                                    }
                                                                    if ("_r".equals(zzatVar2.next())) {
                                                                    }
                                                                    i13 = 1;
                                                                    break;
                                                                }
                                                            } catch (SQLiteException e12) {
                                                                e = e12;
                                                                zzamVar3.zzs.zzay().zzd().zzc("Error deleting over the limit events. appId", zzeo.zzn(str7), e);
                                                                jDelete = 0;
                                                            }
                                                        } catch (SQLiteException e13) {
                                                            e = e13;
                                                            str4 = "raw_events";
                                                        }
                                                    } catch (SQLiteException e14) {
                                                        e = e14;
                                                        str4 = "raw_events";
                                                        i10 = 0;
                                                    }
                                                    zzamVar4.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
                                                    zzamVar5 = this.zze;
                                                    zzal(zzamVar5);
                                                    zzatVar2 = new zzat(zzarVar.zzf);
                                                    zzamVar5.zzg();
                                                    zzamVar5.zzW();
                                                    Preconditions.checkNotNull(zzarVar);
                                                    Preconditions.checkNotEmpty(zzarVar.zza);
                                                    zzlb zzlbVar = zzamVar5.zzf.zzi;
                                                    zzal(zzlbVar);
                                                    byte[] bArrZzbv = zzlbVar.zzj(zzarVar).zzbv();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", zzarVar.zza);
                                                    contentValues.put("name", zzarVar.zzb);
                                                    contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                                                    contentValues.put(str, Long.valueOf(jZzd));
                                                    contentValues.put("data", bArrZzbv);
                                                    contentValues.put("realtime", Integer.valueOf(i13));
                                                    try {
                                                        if (zzamVar5.zzh().insert(str5, null, contentValues) == -1) {
                                                            zzamVar5.zzs.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeo.zzn(zzarVar.zza));
                                                        } else {
                                                            this.zza = 0L;
                                                        }
                                                    } catch (SQLiteException e15) {
                                                        zzamVar5.zzs.zzay().zzd().zzc("Error storing raw event. appId", zzeo.zzn(zzarVar.zza), e15);
                                                    }
                                                    zzam zzamVar21 = this.zze;
                                                    zzal(zzamVar21);
                                                    zzamVar21.zzC();
                                                    zzam zzamVar22 = this.zze;
                                                    zzal(zzamVar22);
                                                    zzamVar22.zzx();
                                                    zzag();
                                                    zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
                                                } catch (SQLiteException e16) {
                                                    zzamVar4.zzs.zzay().zzd().zzc("Error storing raw event metadata. appId", zzeo.zzn(zzgcVar.zzx()), e16);
                                                    throw e16;
                                                }
                                                zzamVar4 = this.zze;
                                                zzal(zzamVar4);
                                                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVarZzt.zzaE();
                                                zzamVar4.zzg();
                                                zzamVar4.zzW();
                                                Preconditions.checkNotNull(zzgcVar);
                                                Preconditions.checkNotEmpty(zzgcVar.zzx());
                                                byte[] bArrZzbv2 = zzgcVar.zzbv();
                                                zzlb zzlbVar2 = zzamVar4.zzf.zzi;
                                                zzal(zzlbVar2);
                                                long jZzd = zzlbVar2.zzd(bArrZzbv2);
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", zzgcVar.zzx());
                                                String str9 = str6;
                                                contentValues2.put(str9, Long.valueOf(jZzd));
                                                contentValues2.put("metadata", bArrZzbv2);
                                            } catch (IOException e17) {
                                                zzay().zzd().zzc("Data loss. Failed to insert raw event metadata. appId", zzeo.zzn(zzgbVarZzt.zzap()), e17);
                                            }
                                            if (jDelete > 0) {
                                                zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeo.zzn(str7), Long.valueOf(jDelete));
                                            }
                                            i11 = i10;
                                            str5 = str4;
                                            zzarVar = new zzar(this.zzn, zzawVarZza.zzc, str7, zzawVarZza.zza, zzawVarZza.zzd, 0L, bundleZzc);
                                            zzam zzamVar23 = this.zze;
                                            zzal(zzamVar23);
                                            zzasVarZzn = zzamVar23.zzn(str7, zzarVar.zzb);
                                            if (zzasVarZzn == null) {
                                                zzamVar6 = this.zze;
                                                zzal(zzamVar6);
                                                if (zzamVar6.zzf(str7) < zzg().zzb(str7)) {
                                                }
                                                zzasVarZzc = new zzas(str7, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
                                            } else {
                                                zzarVar = zzarVar.zza(this.zzn, zzasVarZzn.zzf);
                                                zzasVarZzc = zzasVarZzn.zzc(zzarVar.zzd);
                                            }
                                            zzam zzamVar24 = this.zze;
                                            zzal(zzamVar24);
                                            zzamVar24.zzE(zzasVarZzc);
                                            zzaz().zzg();
                                            zzB();
                                            Preconditions.checkNotNull(zzarVar);
                                            Preconditions.checkNotNull(zzqVar);
                                            Preconditions.checkNotEmpty(zzarVar.zza);
                                            Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                                            zzgbVarZzt = com.google.android.gms.internal.measurement.zzgc.zzt();
                                            zzgbVarZzt.zzad(1);
                                            zzgbVarZzt.zzZ("android");
                                            if (!TextUtils.isEmpty(zzqVar.zza)) {
                                                zzgbVarZzt.zzD(zzqVar.zza);
                                            }
                                            if (!TextUtils.isEmpty(zzqVar.zzd)) {
                                                zzgbVarZzt.zzF(zzqVar.zzd);
                                            }
                                            if (!TextUtils.isEmpty(zzqVar.zzc)) {
                                                zzgbVarZzt.zzG(zzqVar.zzc);
                                            }
                                            zzoz.zzc();
                                            if (zzg().zzs(null, zzeb.zzar)) {
                                                zzgbVarZzt.zzah(zzqVar.zzx);
                                            }
                                            j10 = zzqVar.zzj;
                                            if (j10 != -2147483648L) {
                                                zzgbVarZzt.zzH((int) j10);
                                            }
                                            zzgbVarZzt.zzV(zzqVar.zze);
                                            if (!TextUtils.isEmpty(zzqVar.zzb)) {
                                                zzgbVarZzt.zzU(zzqVar.zzb);
                                            }
                                            zzgbVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                                            if (zzgbVarZzt.zzaq().isEmpty()) {
                                                zzgbVarZzt.zzC(zzqVar.zzq);
                                            }
                                            j11 = zzqVar.zzf;
                                            if (j11 != 0) {
                                                zzgbVarZzt.zzM(j11);
                                            }
                                            zzgbVarZzt.zzP(zzqVar.zzs);
                                            zzlb zzlbVar3 = this.zzi;
                                            zzal(zzlbVar3);
                                            mapZzc = zzeb.zzc(zzlbVar3.zzf.zzn.zzau());
                                            if (mapZzc != null) {
                                                arrayList = null;
                                            } else {
                                                arrayList = null;
                                            }
                                            if (arrayList != null) {
                                                zzgbVarZzt.zzh(arrayList);
                                            }
                                            zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                                            zzahVar = zzah.AD_STORAGE;
                                            if (zzaiVarZzc.zzi(zzahVar)) {
                                                pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                                                if (!TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                                                    zzgbVarZzt.zzae((String) pairZzd.first);
                                                    obj2 = pairZzd.second;
                                                    if (obj2 != null) {
                                                        zzgbVarZzt.zzX(((Boolean) obj2).booleanValue());
                                                    }
                                                }
                                            }
                                            this.zzn.zzg().zzu();
                                            zzgbVarZzt.zzN(Build.MODEL);
                                            this.zzn.zzg().zzu();
                                            zzgbVarZzt.zzY(Build.VERSION.RELEASE);
                                            zzgbVarZzt.zzaj((int) this.zzn.zzg().zzb());
                                            zzgbVarZzt.zzan(this.zzn.zzg().zzc());
                                            if (this.zzn.zzJ()) {
                                                zzgbVarZzt.zzap();
                                                if (!TextUtils.isEmpty(null)) {
                                                    zzgbVarZzt.zzO(null);
                                                }
                                            }
                                            zzam zzamVar25 = this.zze;
                                            zzal(zzamVar25);
                                            zzhVarZzj = zzamVar25.zzj(zzqVar.zza);
                                            if (zzhVarZzj == null) {
                                                zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
                                                zzhVarZzj.zzH(zzw(zzaiVarZzc));
                                                zzhVarZzj.zzV(zzqVar.zzk);
                                                zzhVarZzj.zzW(zzqVar.zzb);
                                                if (zzaiVarZzc.zzi(zzahVar)) {
                                                    zzhVarZzj.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                                                }
                                                zzhVarZzj.zzaa(0L);
                                                zzhVarZzj.zzab(0L);
                                                zzhVarZzj.zzZ(0L);
                                                zzhVarZzj.zzJ(zzqVar.zzc);
                                                zzhVarZzj.zzK(zzqVar.zzj);
                                                zzhVarZzj.zzI(zzqVar.zzd);
                                                zzhVarZzj.zzX(zzqVar.zze);
                                                zzhVarZzj.zzS(zzqVar.zzf);
                                                zzhVarZzj.zzac(zzqVar.zzh);
                                                zzhVarZzj.zzT(zzqVar.zzs);
                                                zzam zzamVar26 = this.zze;
                                                zzal(zzamVar26);
                                                zzamVar26.zzD(zzhVarZzj);
                                            }
                                            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                                                zzgbVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj.zzu()));
                                            }
                                            if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                                                zzgbVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                                            }
                                            zzam zzamVar27 = this.zze;
                                            zzal(zzamVar27);
                                            listZzu = zzamVar27.zzu(zzqVar.zza);
                                            for (i12 = i11; i12 < listZzu.size(); i12++) {
                                                com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
                                                zzgkVarZzd.zzf(((zzle) listZzu.get(i12)).zzc);
                                                zzgkVarZzd.zzg(((zzle) listZzu.get(i12)).zzd);
                                                zzlb zzlbVar4 = this.zzi;
                                                zzal(zzlbVar4);
                                                zzlbVar4.zzu(zzgkVarZzd, ((zzle) listZzu.get(i12)).zze);
                                                zzgbVarZzt.zzl(zzgkVarZzd);
                                            }
                                        }
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        str3 = str2;
                                    }
                                    str = str3;
                                    zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                }
                            } else {
                                str2 = str8;
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze2 = zzg().zze(str7, zzeb.zzD) - 1;
                                Preconditions.checkNotEmpty(str7);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                SQLiteDatabase sQLiteDatabaseZzh2 = zzamVar.zzh();
                                str3 = str2;
                                String[] strArr2 = new String[3];
                                strArr2[0] = str7;
                                strArr2[1] = str7;
                                str6 = "metadata_fingerprint";
                                strArr2[2] = String.valueOf(iZze2);
                                sQLiteDatabaseZzh2.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr2);
                                str = str3;
                                zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            }
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            if (!zzamVar2.zzL(zzleVar)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeo.zzn(str7), this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                                zzv().zzN(this.zzF, str7, 9, null, null, 0);
                            }
                        }
                    }
                    str = str8;
                } else if (z10) {
                    z10 = true;
                    strZzg = zzawVarZza.zzb.zzg(AppLovinEventParameters.REVENUE_CURRENCY);
                    if (z10) {
                        dDoubleValue = zzawVarZza.zzb.zzd("value").doubleValue() * 1000000.0d;
                        if (dDoubleValue == 0.0d) {
                            dDoubleValue = zzawVarZza.zzb.zze("value").longValue() * 1000000.0d;
                        }
                        if (dDoubleValue <= 9.223372036854776E18d) {
                        }
                        zzay().zzk().zzc("Data lost. Currency value is too big. appId", zzeo.zzn(str7), Double.valueOf(dDoubleValue));
                        zzam zzamVar28 = this.zze;
                        zzal(zzamVar28);
                        zzamVar28.zzC();
                        zzam zzamVar110 = this.zze;
                        zzal(zzamVar110);
                        zzamVar110.zzx();
                        return;
                    }
                    str8 = "_err";
                    jLongValue = zzawVarZza.zzb.zze("value").longValue();
                    if (!TextUtils.isEmpty(strZzg)) {
                        upperCase = strZzg.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            strConcat = "_ltv_".concat(upperCase);
                            zzam zzamVar111 = this.zze;
                            zzal(zzamVar111);
                            zzleVarZzp = zzamVar111.zzp(str7, strConcat);
                            if (zzleVarZzp != null) {
                                obj = zzleVarZzp.zze;
                                if (obj instanceof Long) {
                                    str2 = str8;
                                    zzamVar = this.zze;
                                    zzal(zzamVar);
                                    int iZze3 = zzg().zze(str7, zzeb.zzD) - 1;
                                    Preconditions.checkNotEmpty(str7);
                                    zzamVar.zzg();
                                    zzamVar.zzW();
                                    SQLiteDatabase sQLiteDatabaseZzh3 = zzamVar.zzh();
                                    str3 = str2;
                                    String[] strArr3 = new String[3];
                                    strArr3[0] = str7;
                                    strArr3[1] = str7;
                                    str6 = "metadata_fingerprint";
                                    strArr3[2] = String.valueOf(iZze3);
                                    sQLiteDatabaseZzh3.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr3);
                                    str = str3;
                                    zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                                } else {
                                    str6 = "metadata_fingerprint";
                                    str = str8;
                                    zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + jLongValue));
                                }
                            } else {
                                str2 = str8;
                                zzamVar = this.zze;
                                zzal(zzamVar);
                                int iZze4 = zzg().zze(str7, zzeb.zzD) - 1;
                                Preconditions.checkNotEmpty(str7);
                                zzamVar.zzg();
                                zzamVar.zzW();
                                SQLiteDatabase sQLiteDatabaseZzh4 = zzamVar.zzh();
                                str3 = str2;
                                String[] strArr4 = new String[3];
                                strArr4[0] = str7;
                                strArr4[1] = str7;
                                str6 = "metadata_fingerprint";
                                strArr4[2] = String.valueOf(iZze4);
                                sQLiteDatabaseZzh4.execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", strArr4);
                                str = str3;
                                zzleVar = new zzle(str7, zzawVarZza.zzc, strConcat, zzav().currentTimeMillis(), Long.valueOf(jLongValue));
                            }
                            zzamVar2 = this.zze;
                            zzal(zzamVar2);
                            if (!zzamVar2.zzL(zzleVar)) {
                                zzay().zzd().zzd("Too many unique user properties are set. Ignoring user property. appId", zzeo.zzn(str7), this.zzn.zzj().zzf(zzleVar.zzc), zzleVar.zze);
                                zzv().zzN(this.zzF, str7, 9, null, null, 0);
                            }
                        }
                    }
                    str = str8;
                } else {
                    str = "_err";
                }
                zZzai = zzlh.zzai(zzawVarZza.zza);
                zEquals = str.equals(zzawVarZza.zza);
                zzv();
                zzauVar = zzawVarZza.zzb;
                if (zzauVar == null) {
                    length = 0;
                } else {
                    zzatVar = new zzat(zzauVar);
                    length = 0;
                    while (zzatVar.hasNext()) {
                        objZzf = zzauVar.zzf(zzatVar.next());
                        if (objZzf instanceof Parcelable[]) {
                            length += (long) ((Parcelable[]) objZzf).length;
                        }
                    }
                }
                zzam zzamVar112 = this.zze;
                zzal(zzamVar112);
                zzakVarZzm = zzamVar112.zzm(zza(), str7, length + 1, true, zZzai, false, zEquals, false);
                long j14 = zzakVarZzm.zzb;
                zzg();
                jIntValue = j14 - ((long) ((Integer) zzeb.zzj.zza(null)).intValue());
                if (jIntValue > 0) {
                    if (jIntValue % 1000 == 1) {
                        zzay().zzd().zzc("Data loss. Too many events logged. appId, count", zzeo.zzn(str7), Long.valueOf(zzakVarZzm.zzb));
                    }
                    zzam zzamVar113 = this.zze;
                    zzal(zzamVar113);
                    zzamVar113.zzC();
                    zzam zzamVar114 = this.zze;
                    zzal(zzamVar114);
                    zzamVar114.zzx();
                    return;
                }
                if (zZzai) {
                    long j15 = zzakVarZzm.zza;
                    zzg();
                    jIntValue2 = j15 - ((long) ((Integer) zzeb.zzl.zza(null)).intValue());
                    if (jIntValue2 > 0) {
                        if (jIntValue2 % 1000 == 1) {
                            zzay().zzd().zzc("Data loss. Too many public events logged. appId, count", zzeo.zzn(str7), Long.valueOf(zzakVarZzm.zza));
                        }
                        zzv().zzN(this.zzF, str7, 16, "_ev", zzawVarZza.zza, 0);
                        zzam zzamVar115 = this.zze;
                        zzal(zzamVar115);
                        zzamVar115.zzC();
                        zzam zzamVar116 = this.zze;
                        zzal(zzamVar116);
                        zzamVar116.zzx();
                        return;
                    }
                }
                if (zEquals) {
                    jMax = zzakVarZzm.zzd - ((long) Math.max(0, Math.min(1000000, zzg().zze(zzqVar.zza, zzeb.zzk))));
                    if (jMax > 0) {
                        if (jMax == 1) {
                            zzay().zzd().zzc("Too many error events logged. appId, count", zzeo.zzn(str7), Long.valueOf(zzakVarZzm.zzd));
                        }
                        zzam zzamVar117 = this.zze;
                        zzal(zzamVar117);
                        zzamVar117.zzC();
                        zzam zzamVar118 = this.zze;
                        zzal(zzamVar118);
                        zzamVar118.zzx();
                        return;
                    }
                }
                bundleZzc = zzawVarZza.zzb.zzc();
                zzv().zzO(bundleZzc, "_o", zzawVarZza.zzc);
                if (zzv().zzae(str7)) {
                    zzv().zzO(bundleZzc, "_dbg", 1L);
                    zzv().zzO(bundleZzc, "_r", 1L);
                }
                if ("_s".equals(zzawVarZza.zza)) {
                    zzam zzamVar119 = this.zze;
                    zzal(zzamVar119);
                    zzleVarZzp2 = zzamVar119.zzp(zzqVar.zza, "_sno");
                    if (zzleVarZzp2 != null && (zzleVarZzp2.zze instanceof Long)) {
                        zzv().zzO(bundleZzc, "_sno", zzleVarZzp2.zze);
                    }
                }
                zzamVar3 = this.zze;
                zzal(zzamVar3);
                Preconditions.checkNotEmpty(str7);
                zzamVar3.zzg();
                zzamVar3.zzW();
                i10 = 0;
                str4 = "raw_events";
                jDelete = zzamVar3.zzh().delete(str4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str7, String.valueOf(Math.max(0, Math.min(1000000, zzamVar3.zzs.zzf().zze(str7, zzeb.zzo))))});
                if (jDelete > 0) {
                    zzay().zzk().zzc("Data lost. Too many events stored on disk, deleted. appId", zzeo.zzn(str7), Long.valueOf(jDelete));
                }
                i11 = i10;
                str5 = str4;
                zzarVar = new zzar(this.zzn, zzawVarZza.zzc, str7, zzawVarZza.zza, zzawVarZza.zzd, 0L, bundleZzc);
                zzam zzamVar29 = this.zze;
                zzal(zzamVar29);
                zzasVarZzn = zzamVar29.zzn(str7, zzarVar.zzb);
                if (zzasVarZzn == null) {
                    zzamVar6 = this.zze;
                    zzal(zzamVar6);
                    if (zzamVar6.zzf(str7) < zzg().zzb(str7) && zZzai) {
                        zzay().zzd().zzd("Too many event names used, ignoring event. appId, name, supported count", zzeo.zzn(str7), this.zzn.zzj().zzd(zzarVar.zzb), Integer.valueOf(zzg().zzb(str7)));
                        zzv().zzN(this.zzF, str7, 8, null, null, 0);
                        zzam zzamVar30 = this.zze;
                        zzal(zzamVar30);
                        zzamVar30.zzx();
                        return;
                    }
                    zzasVarZzc = new zzas(str7, zzarVar.zzb, 0L, 0L, 0L, zzarVar.zzd, 0L, null, null, null, null);
                } else {
                    zzarVar = zzarVar.zza(this.zzn, zzasVarZzn.zzf);
                    zzasVarZzc = zzasVarZzn.zzc(zzarVar.zzd);
                }
                zzam zzamVar210 = this.zze;
                zzal(zzamVar210);
                zzamVar210.zzE(zzasVarZzc);
                zzaz().zzg();
                zzB();
                Preconditions.checkNotNull(zzarVar);
                Preconditions.checkNotNull(zzqVar);
                Preconditions.checkNotEmpty(zzarVar.zza);
                Preconditions.checkArgument(zzarVar.zza.equals(zzqVar.zza));
                zzgbVarZzt = com.google.android.gms.internal.measurement.zzgc.zzt();
                zzgbVarZzt.zzad(1);
                zzgbVarZzt.zzZ("android");
                if (!TextUtils.isEmpty(zzqVar.zza)) {
                    zzgbVarZzt.zzD(zzqVar.zza);
                }
                if (!TextUtils.isEmpty(zzqVar.zzd)) {
                    zzgbVarZzt.zzF(zzqVar.zzd);
                }
                if (!TextUtils.isEmpty(zzqVar.zzc)) {
                    zzgbVarZzt.zzG(zzqVar.zzc);
                }
                zzoz.zzc();
                if (zzg().zzs(null, zzeb.zzar) && !TextUtils.isEmpty(zzqVar.zzx)) {
                    zzgbVarZzt.zzah(zzqVar.zzx);
                }
                j10 = zzqVar.zzj;
                if (j10 != -2147483648L) {
                    zzgbVarZzt.zzH((int) j10);
                }
                zzgbVarZzt.zzV(zzqVar.zze);
                if (!TextUtils.isEmpty(zzqVar.zzb)) {
                    zzgbVarZzt.zzU(zzqVar.zzb);
                }
                zzgbVarZzt.zzL(zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv)).zzh());
                if (zzgbVarZzt.zzaq().isEmpty() && !TextUtils.isEmpty(zzqVar.zzq)) {
                    zzgbVarZzt.zzC(zzqVar.zzq);
                }
                j11 = zzqVar.zzf;
                if (j11 != 0) {
                    zzgbVarZzt.zzM(j11);
                }
                zzgbVarZzt.zzP(zzqVar.zzs);
                zzlb zzlbVar5 = this.zzi;
                zzal(zzlbVar5);
                mapZzc = zzeb.zzc(zzlbVar5.zzf.zzn.zzau());
                if (mapZzc != null || mapZzc.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    int iIntValue = ((Integer) zzeb.zzO.zza(null)).intValue();
                    for (Map.Entry entry : mapZzc.entrySet()) {
                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                            try {
                                int i14 = Integer.parseInt((String) entry.getValue());
                                if (i14 != 0) {
                                    arrayList.add(Integer.valueOf(i14));
                                    if (arrayList.size() >= iIntValue) {
                                        zzlbVar5.zzs.zzay().zzk().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                        break;
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            } catch (NumberFormatException e19) {
                                zzlbVar5.zzs.zzay().zzk().zzb("Experiment ID NumberFormatException", e19);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                }
                if (arrayList != null) {
                    zzgbVarZzt.zzh(arrayList);
                }
                zzaiVarZzc = zzh((String) Preconditions.checkNotNull(zzqVar.zza)).zzc(zzai.zzb(zzqVar.zzv));
                zzahVar = zzah.AD_STORAGE;
                if (zzaiVarZzc.zzi(zzahVar) && zzqVar.zzo) {
                    pairZzd = this.zzk.zzd(zzqVar.zza, zzaiVarZzc);
                    if (!TextUtils.isEmpty((CharSequence) pairZzd.first) && zzqVar.zzo) {
                        zzgbVarZzt.zzae((String) pairZzd.first);
                        obj2 = pairZzd.second;
                        if (obj2 != null) {
                            zzgbVarZzt.zzX(((Boolean) obj2).booleanValue());
                        }
                    }
                }
                this.zzn.zzg().zzu();
                zzgbVarZzt.zzN(Build.MODEL);
                this.zzn.zzg().zzu();
                zzgbVarZzt.zzY(Build.VERSION.RELEASE);
                zzgbVarZzt.zzaj((int) this.zzn.zzg().zzb());
                zzgbVarZzt.zzan(this.zzn.zzg().zzc());
                if (this.zzn.zzJ()) {
                    zzgbVarZzt.zzap();
                    if (!TextUtils.isEmpty(null)) {
                        zzgbVarZzt.zzO(null);
                    }
                }
                zzam zzamVar211 = this.zze;
                zzal(zzamVar211);
                zzhVarZzj = zzamVar211.zzj(zzqVar.zza);
                if (zzhVarZzj == null) {
                    zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
                    zzhVarZzj.zzH(zzw(zzaiVarZzc));
                    zzhVarZzj.zzV(zzqVar.zzk);
                    zzhVarZzj.zzW(zzqVar.zzb);
                    if (zzaiVarZzc.zzi(zzahVar)) {
                        zzhVarZzj.zzae(this.zzk.zzf(zzqVar.zza, zzqVar.zzo));
                    }
                    zzhVarZzj.zzaa(0L);
                    zzhVarZzj.zzab(0L);
                    zzhVarZzj.zzZ(0L);
                    zzhVarZzj.zzJ(zzqVar.zzc);
                    zzhVarZzj.zzK(zzqVar.zzj);
                    zzhVarZzj.zzI(zzqVar.zzd);
                    zzhVarZzj.zzX(zzqVar.zze);
                    zzhVarZzj.zzS(zzqVar.zzf);
                    zzhVarZzj.zzac(zzqVar.zzh);
                    zzhVarZzj.zzT(zzqVar.zzs);
                    zzam zzamVar212 = this.zze;
                    zzal(zzamVar212);
                    zzamVar212.zzD(zzhVarZzj);
                }
                if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzhVarZzj.zzu())) {
                    zzgbVarZzt.zzE((String) Preconditions.checkNotNull(zzhVarZzj.zzu()));
                }
                if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                    zzgbVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                }
                zzam zzamVar213 = this.zze;
                zzal(zzamVar213);
                listZzu = zzamVar213.zzu(zzqVar.zza);
                while (i12 < listZzu.size()) {
                    com.google.android.gms.internal.measurement.zzgk zzgkVarZzd2 = com.google.android.gms.internal.measurement.zzgl.zzd();
                    zzgkVarZzd2.zzf(((zzle) listZzu.get(i12)).zzc);
                    zzgkVarZzd2.zzg(((zzle) listZzu.get(i12)).zzd);
                    zzlb zzlbVar6 = this.zzi;
                    zzal(zzlbVar6);
                    zzlbVar6.zzu(zzgkVarZzd2, ((zzle) listZzu.get(i12)).zze);
                    zzgbVarZzt.zzl(zzgkVarZzd2);
                }
                zzamVar4 = this.zze;
                zzal(zzamVar4);
                zzgcVar = (com.google.android.gms.internal.measurement.zzgc) zzgbVarZzt.zzaE();
                zzamVar4.zzg();
                zzamVar4.zzW();
                Preconditions.checkNotNull(zzgcVar);
                Preconditions.checkNotEmpty(zzgcVar.zzx());
                byte[] bArrZzbv3 = zzgcVar.zzbv();
                zzlb zzlbVar7 = zzamVar4.zzf.zzi;
                zzal(zzlbVar7);
                long jZzd2 = zzlbVar7.zzd(bArrZzbv3);
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("app_id", zzgcVar.zzx());
                String str10 = str6;
                contentValues3.put(str10, Long.valueOf(jZzd2));
                contentValues3.put("metadata", bArrZzbv3);
                zzamVar4.zzh().insertWithOnConflict("raw_events_metadata", null, contentValues3, 4);
                zzamVar5 = this.zze;
                zzal(zzamVar5);
                zzatVar2 = new zzat(zzarVar.zzf);
                while (true) {
                    if (zzatVar2.hasNext()) {
                        zzfp zzfpVar5 = this.zzc;
                        zzal(zzfpVar5);
                        zZzq = zzfpVar5.zzq(zzarVar.zza, zzarVar.zzb);
                        zzam zzamVar214 = this.zze;
                        zzal(zzamVar214);
                        zzak zzakVarZzl2 = zzamVar214.zzl(zza(), zzarVar.zza, false, false, false, false, false);
                        if (zZzq || zzakVarZzl2.zze >= zzg().zze(zzarVar.zza, zzeb.zzn)) {
                            i13 = i11;
                            break;
                        }
                    } else if ("_r".equals(zzatVar2.next())) {
                    }
                    i13 = 1;
                    break;
                }
                zzamVar5.zzg();
                zzamVar5.zzW();
                Preconditions.checkNotNull(zzarVar);
                Preconditions.checkNotEmpty(zzarVar.zza);
                zzlb zzlbVar8 = zzamVar5.zzf.zzi;
                zzal(zzlbVar8);
                byte[] bArrZzbv4 = zzlbVar8.zzj(zzarVar).zzbv();
                contentValues = new ContentValues();
                contentValues.put("app_id", zzarVar.zza);
                contentValues.put("name", zzarVar.zzb);
                contentValues.put("timestamp", Long.valueOf(zzarVar.zzd));
                contentValues.put(str10, Long.valueOf(jZzd2));
                contentValues.put("data", bArrZzbv4);
                contentValues.put("realtime", Integer.valueOf(i13));
                if (zzamVar5.zzh().insert(str5, null, contentValues) == -1) {
                    zzamVar5.zzs.zzay().zzd().zzb("Failed to insert raw event (got -1). appId", zzeo.zzn(zzarVar.zza));
                } else {
                    this.zza = 0L;
                }
                zzam zzamVar215 = this.zze;
                zzal(zzamVar215);
                zzamVar215.zzC();
                zzam zzamVar216 = this.zze;
                zzal(zzamVar216);
                zzamVar216.zzx();
                zzag();
                zzay().zzj().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
            } catch (Throwable th) {
                zzam zzamVar31 = this.zze;
                zzal(zzamVar31);
                zzamVar31.zzx();
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final boolean zzZ() {
        zzem zzemVarZzk;
        String str;
        zzaz().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzay().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzs.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzau().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.zzw = fileLockTryLock;
            if (fileLockTryLock != null) {
                zzay().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzay().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            e = e10;
            zzemVarZzk = zzay().zzd();
            str = "Failed to acquire storage lock";
            zzemVarZzk.zzb(str, e);
            return false;
        } catch (IOException e11) {
            e = e11;
            zzemVarZzk = zzay().zzd();
            str = "Failed to access storage lock file";
            zzemVarZzk.zzb(str, e);
            return false;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            zzemVarZzk = zzay().zzk();
            str = "Storage lock already acquired";
            zzemVarZzk.zzb(str, e);
            return false;
        }
    }

    public final long zza() {
        long jCurrentTimeMillis = zzav().currentTimeMillis();
        zzju zzjuVar = this.zzk;
        zzjuVar.zzW();
        zzjuVar.zzg();
        long jZza = zzjuVar.zze.zza();
        if (jZza == 0) {
            jZza = ((long) zzjuVar.zzs.zzv().zzG().nextInt(DateTimeConstants.MILLIS_PER_DAY)) + 1;
            zzjuVar.zze.zzb(jZza);
        }
        return ((((jCurrentTimeMillis + jZza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final Context zzau() {
        return this.zzn.zzau();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final Clock zzav() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzav();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final zzab zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final zzeo zzay() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzay();
    }

    @Override // com.google.android.gms.measurement.internal.zzgt
    public final zzfv zzaz() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzaz();
    }

    public final zzh zzd(zzq zzqVar) {
        zzaz().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzow.zzc();
        zzkx zzkxVar = null;
        if (zzg().zzs(zzqVar.zza, zzeb.zzat) && !zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzky(this, zzqVar.zzw));
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        zzh zzhVarZzj = zzamVar.zzj(zzqVar.zza);
        zzai zzaiVarZzc = zzh(zzqVar.zza).zzc(zzai.zzb(zzqVar.zzv));
        zzah zzahVar = zzah.AD_STORAGE;
        String strZzf = zzaiVarZzc.zzi(zzahVar) ? this.zzk.zzf(zzqVar.zza, zzqVar.zzo) : "";
        if (zzhVarZzj == null) {
            zzhVarZzj = new zzh(this.zzn, zzqVar.zza);
            if (zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
            }
            if (zzaiVarZzc.zzi(zzahVar)) {
                zzhVarZzj.zzae(strZzf);
            }
        } else if (zzaiVarZzc.zzi(zzahVar) && strZzf != null && !strZzf.equals(zzhVarZzj.zzA())) {
            zzhVarZzj.zzae(strZzf);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzaiVarZzc).first)) {
                zzhVarZzj.zzH(zzw(zzaiVarZzc));
                zzam zzamVar2 = this.zze;
                zzal(zzamVar2);
                if (zzamVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzam zzamVar3 = this.zze;
                    zzal(zzamVar3);
                    if (zzamVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzle zzleVar = new zzle(zzqVar.zza, "auto", "_lair", zzav().currentTimeMillis(), 1L);
                        zzam zzamVar4 = this.zze;
                        zzal(zzamVar4);
                        zzamVar4.zzL(zzleVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzhVarZzj.zzu()) && zzaiVarZzc.zzi(zzah.ANALYTICS_STORAGE)) {
            zzhVarZzj.zzH(zzw(zzaiVarZzc));
        }
        zzhVarZzj.zzW(zzqVar.zzb);
        zzhVarZzj.zzF(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzhVarZzj.zzV(zzqVar.zzk);
        }
        long j10 = zzqVar.zze;
        if (j10 != 0) {
            zzhVarZzj.zzX(j10);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzhVarZzj.zzJ(zzqVar.zzc);
        }
        zzhVarZzj.zzK(zzqVar.zzj);
        String str = zzqVar.zzd;
        if (str != null) {
            zzhVarZzj.zzI(str);
        }
        zzhVarZzj.zzS(zzqVar.zzf);
        zzhVarZzj.zzac(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzhVarZzj.zzY(zzqVar.zzg);
        }
        zzhVarZzj.zzG(zzqVar.zzo);
        zzhVarZzj.zzad(zzqVar.zzr);
        zzhVarZzj.zzT(zzqVar.zzs);
        zzoz.zzc();
        if (zzg().zzs(null, zzeb.zzar)) {
            zzhVarZzj.zzag(zzqVar.zzx);
        }
        zzns.zzc();
        if (zzg().zzs(null, zzeb.zzaj)) {
            zzhVarZzj.zzaf(zzqVar.zzt);
        } else {
            zzns.zzc();
            if (zzg().zzs(null, zzeb.zzai)) {
                zzhVarZzj.zzaf(null);
            }
        }
        if (zzhVarZzj.zzaj()) {
            zzam zzamVar5 = this.zze;
            zzal(zzamVar5);
            zzamVar5.zzD(zzhVarZzj);
        }
        return zzhVarZzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzai zzh(String str) {
        String string;
        zzai zzaiVar = zzai.zza;
        zzaz().zzg();
        zzB();
        zzai zzaiVar2 = (zzai) this.zzB.get(str);
        if (zzaiVar2 != null) {
            return zzaiVar2;
        }
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        Preconditions.checkNotNull(str);
        zzamVar.zzg();
        zzamVar.zzW();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzamVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursorRawQuery.moveToFirst()) {
                    string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                } else {
                    cursorRawQuery.close();
                    string = "G1";
                }
                zzai zzaiVarZzb = zzai.zzb(string);
                zzV(str, zzaiVarZzb);
                return zzaiVarZzb;
            } catch (SQLiteException e10) {
                zzamVar.zzs.zzay().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final zzam zzi() {
        zzam zzamVar = this.zze;
        zzal(zzamVar);
        return zzamVar;
    }

    public final zzej zzj() {
        return this.zzn.zzj();
    }

    public final zzeu zzl() {
        zzeu zzeuVar = this.zzd;
        zzal(zzeuVar);
        return zzeuVar;
    }

    public final zzew zzm() {
        zzew zzewVar = this.zzf;
        if (zzewVar != null) {
            return zzewVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfp zzo() {
        zzfp zzfpVar = this.zzc;
        zzal(zzfpVar);
        return zzfpVar;
    }

    public final zzfy zzq() {
        return this.zzn;
    }

    public final zzii zzr() {
        zzii zziiVar = this.zzj;
        zzal(zziiVar);
        return zziiVar;
    }

    public final zzju zzs() {
        return this.zzk;
    }

    public final zzlb zzu() {
        zzlb zzlbVar = this.zzi;
        zzal(zzlbVar);
        return zzlbVar;
    }

    public final zzlh zzv() {
        return ((zzfy) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    public final String zzw(zzai zzaiVar) {
        if (!zzaiVar.zzi(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzv().zzG().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaz().zzh(new zzks(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzay().zzd().zzc("Failed to get app instance id. appId", zzeo.zzn(zzqVar.zza), e10);
            return null;
        }
    }

    public final void zzz(Runnable runnable) {
        zzaz().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
