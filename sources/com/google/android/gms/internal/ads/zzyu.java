package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyu extends zzrw {
    private static final int[] zzb = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private long zzB;
    private int zzC;
    private long zzD;
    private zzdn zzE;
    private zzdn zzF;
    private int zzG;
    private zzyy zzH;
    private final Context zze;
    private final zzzf zzf;
    private final zzzq zzg;
    private final zzyt zzh;
    private final boolean zzi;
    private zzym zzj;
    private boolean zzk;
    private boolean zzl;
    private Surface zzm;
    private zzyx zzn;
    private boolean zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private long zzz;

    public zzyu(Context context, zzro zzroVar, zzry zzryVar, long j10, boolean z10, Handler handler, zzzr zzzrVar, int i10, float f10) {
        zzyp zzypVar = new zzyp(null);
        super(2, zzroVar, zzryVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        zzzf zzzfVar = new zzzf(applicationContext);
        this.zzf = zzzfVar;
        this.zzg = new zzzq(handler, zzzrVar);
        this.zzh = new zzyt(zzypVar, zzzfVar, this);
        this.zzi = "NVIDIA".equals(zzfj.zzc);
        this.zzu = -9223372036854775807L;
        this.zzp = 1;
        this.zzE = zzdn.zza;
        this.zzG = 0;
        this.zzF = null;
    }

    public static int zzW(zzrs zzrsVar, zzam zzamVar) {
        int iIntValue;
        int i10 = zzamVar.zzr;
        int i11 = zzamVar.zzs;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        String str = zzamVar.zzm;
        if ("video/dolby-vision".equals(str)) {
            Pair pairZzb = zzsl.zzb(zzamVar);
            str = (pairZzb == null || !((iIntValue = ((Integer) pairZzb.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/av01":
            case "video/x-vnd.on2.vp8":
                return ((i10 * i11) * 3) / 4;
            case "video/hevc":
                return Math.max(2097152, ((i10 * i11) * 3) / 4);
            case "video/avc":
                String str2 = zzfj.zzd;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(zzfj.zzc) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && zzrsVar.zzf)))) {
                    return -1;
                }
                return ((((i11 + 15) / 16) * ((i10 + 15) / 16)) * 768) / 4;
            case "video/x-vnd.on2.vp9":
                return ((i10 * i11) * 3) / 8;
            default:
                return -1;
        }
    }

    public static int zzX(zzrs zzrsVar, zzam zzamVar) {
        if (zzamVar.zzn == -1) {
            return zzW(zzrsVar, zzamVar);
        }
        int size = zzamVar.zzo.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += ((byte[]) zzamVar.zzo.get(i10)).length;
        }
        return zzamVar.zzn + length;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0148  */
    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:0x0154  */
    /* JADX WARN: Code duplicated, block: B:105:0x015c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0160  */
    /* JADX WARN: Code duplicated, block: B:108:0x0168  */
    /* JADX WARN: Code duplicated, block: B:109:0x016c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0174  */
    /* JADX WARN: Code duplicated, block: B:112:0x0178  */
    /* JADX WARN: Code duplicated, block: B:114:0x0180  */
    /* JADX WARN: Code duplicated, block: B:115:0x0184  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0190  */
    /* JADX WARN: Code duplicated, block: B:120:0x0198  */
    /* JADX WARN: Code duplicated, block: B:121:0x019c  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:133:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x0204  */
    /* JADX WARN: Code duplicated, block: B:148:0x0208  */
    /* JADX WARN: Code duplicated, block: B:150:0x0210  */
    /* JADX WARN: Code duplicated, block: B:151:0x0214  */
    /* JADX WARN: Code duplicated, block: B:153:0x021c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0220  */
    /* JADX WARN: Code duplicated, block: B:156:0x0228  */
    /* JADX WARN: Code duplicated, block: B:157:0x022c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0234  */
    /* JADX WARN: Code duplicated, block: B:160:0x0238  */
    /* JADX WARN: Code duplicated, block: B:162:0x0240  */
    /* JADX WARN: Code duplicated, block: B:163:0x0244  */
    /* JADX WARN: Code duplicated, block: B:165:0x024c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0250  */
    /* JADX WARN: Code duplicated, block: B:168:0x0258  */
    /* JADX WARN: Code duplicated, block: B:169:0x025c  */
    /* JADX WARN: Code duplicated, block: B:171:0x0264  */
    /* JADX WARN: Code duplicated, block: B:172:0x0268  */
    /* JADX WARN: Code duplicated, block: B:174:0x0270  */
    /* JADX WARN: Code duplicated, block: B:175:0x0274  */
    /* JADX WARN: Code duplicated, block: B:177:0x027c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0280  */
    /* JADX WARN: Code duplicated, block: B:180:0x0288  */
    /* JADX WARN: Code duplicated, block: B:181:0x028c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0294  */
    /* JADX WARN: Code duplicated, block: B:184:0x0298  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:189:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:198:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:204:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:205:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:208:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:211:0x0303  */
    /* JADX WARN: Code duplicated, block: B:213:0x030b  */
    /* JADX WARN: Code duplicated, block: B:214:0x030f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0317  */
    /* JADX WARN: Code duplicated, block: B:217:0x031b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0323  */
    /* JADX WARN: Code duplicated, block: B:220:0x0327  */
    /* JADX WARN: Code duplicated, block: B:222:0x032f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0333  */
    /* JADX WARN: Code duplicated, block: B:225:0x033b  */
    /* JADX WARN: Code duplicated, block: B:226:0x033f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0347  */
    /* JADX WARN: Code duplicated, block: B:229:0x034b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0353  */
    /* JADX WARN: Code duplicated, block: B:232:0x0357  */
    /* JADX WARN: Code duplicated, block: B:234:0x035f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0363  */
    /* JADX WARN: Code duplicated, block: B:237:0x036b  */
    /* JADX WARN: Code duplicated, block: B:238:0x036f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0377  */
    /* JADX WARN: Code duplicated, block: B:241:0x037b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0383  */
    /* JADX WARN: Code duplicated, block: B:244:0x0387  */
    /* JADX WARN: Code duplicated, block: B:246:0x038f  */
    /* JADX WARN: Code duplicated, block: B:247:0x0393  */
    /* JADX WARN: Code duplicated, block: B:249:0x039b  */
    /* JADX WARN: Code duplicated, block: B:250:0x039f  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:255:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:258:0x03be  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:262:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:267:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:270:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:271:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:273:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:274:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:276:0x0404  */
    /* JADX WARN: Code duplicated, block: B:277:0x0408  */
    /* JADX WARN: Code duplicated, block: B:279:0x0410  */
    /* JADX WARN: Code duplicated, block: B:280:0x0414  */
    /* JADX WARN: Code duplicated, block: B:282:0x041c  */
    /* JADX WARN: Code duplicated, block: B:283:0x0420  */
    /* JADX WARN: Code duplicated, block: B:285:0x0428  */
    /* JADX WARN: Code duplicated, block: B:286:0x042c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0434  */
    /* JADX WARN: Code duplicated, block: B:289:0x0438  */
    /* JADX WARN: Code duplicated, block: B:291:0x0440  */
    /* JADX WARN: Code duplicated, block: B:292:0x0444  */
    /* JADX WARN: Code duplicated, block: B:294:0x044c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0450  */
    /* JADX WARN: Code duplicated, block: B:297:0x0458  */
    /* JADX WARN: Code duplicated, block: B:298:0x045c  */
    /* JADX WARN: Code duplicated, block: B:300:0x0464  */
    /* JADX WARN: Code duplicated, block: B:301:0x0468  */
    /* JADX WARN: Code duplicated, block: B:303:0x0470  */
    /* JADX WARN: Code duplicated, block: B:304:0x0474  */
    /* JADX WARN: Code duplicated, block: B:306:0x047c  */
    /* JADX WARN: Code duplicated, block: B:307:0x0480  */
    /* JADX WARN: Code duplicated, block: B:309:0x0488  */
    /* JADX WARN: Code duplicated, block: B:310:0x048c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0494  */
    /* JADX WARN: Code duplicated, block: B:313:0x0497  */
    /* JADX WARN: Code duplicated, block: B:315:0x049f  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:318:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:319:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:322:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:325:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:327:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:328:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:330:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:331:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:336:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:337:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:339:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:340:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:342:0x0505  */
    /* JADX WARN: Code duplicated, block: B:343:0x0509  */
    /* JADX WARN: Code duplicated, block: B:345:0x0511  */
    /* JADX WARN: Code duplicated, block: B:346:0x0515  */
    /* JADX WARN: Code duplicated, block: B:348:0x051d  */
    /* JADX WARN: Code duplicated, block: B:349:0x0521  */
    /* JADX WARN: Code duplicated, block: B:351:0x0529  */
    /* JADX WARN: Code duplicated, block: B:352:0x052d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0535  */
    /* JADX WARN: Code duplicated, block: B:355:0x0539  */
    /* JADX WARN: Code duplicated, block: B:357:0x0541  */
    /* JADX WARN: Code duplicated, block: B:358:0x0545  */
    /* JADX WARN: Code duplicated, block: B:360:0x054d  */
    /* JADX WARN: Code duplicated, block: B:361:0x0551  */
    /* JADX WARN: Code duplicated, block: B:363:0x0559  */
    /* JADX WARN: Code duplicated, block: B:364:0x055d  */
    /* JADX WARN: Code duplicated, block: B:366:0x0565  */
    /* JADX WARN: Code duplicated, block: B:367:0x0569  */
    /* JADX WARN: Code duplicated, block: B:369:0x0571  */
    /* JADX WARN: Code duplicated, block: B:370:0x0575  */
    /* JADX WARN: Code duplicated, block: B:372:0x057d  */
    /* JADX WARN: Code duplicated, block: B:373:0x0581  */
    /* JADX WARN: Code duplicated, block: B:375:0x0589  */
    /* JADX WARN: Code duplicated, block: B:376:0x058d  */
    /* JADX WARN: Code duplicated, block: B:378:0x0595  */
    /* JADX WARN: Code duplicated, block: B:379:0x0599  */
    /* JADX WARN: Code duplicated, block: B:381:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:382:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:384:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:385:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:387:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:388:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:391:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:393:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:394:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:396:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:397:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:399:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:400:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:403:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:405:0x0601  */
    /* JADX WARN: Code duplicated, block: B:406:0x0605  */
    /* JADX WARN: Code duplicated, block: B:408:0x060d  */
    /* JADX WARN: Code duplicated, block: B:409:0x0611  */
    /* JADX WARN: Code duplicated, block: B:411:0x0619  */
    /* JADX WARN: Code duplicated, block: B:412:0x061d  */
    /* JADX WARN: Code duplicated, block: B:414:0x0625  */
    /* JADX WARN: Code duplicated, block: B:415:0x0629  */
    /* JADX WARN: Code duplicated, block: B:417:0x0631  */
    /* JADX WARN: Code duplicated, block: B:418:0x0635  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x063d  */
    /* JADX WARN: Code duplicated, block: B:421:0x0641  */
    /* JADX WARN: Code duplicated, block: B:423:0x0649  */
    /* JADX WARN: Code duplicated, block: B:424:0x064d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0655  */
    /* JADX WARN: Code duplicated, block: B:427:0x0658  */
    /* JADX WARN: Code duplicated, block: B:429:0x0660  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:430:0x0663  */
    /* JADX WARN: Code duplicated, block: B:432:0x066b  */
    /* JADX WARN: Code duplicated, block: B:433:0x066f  */
    /* JADX WARN: Code duplicated, block: B:435:0x0677  */
    /* JADX WARN: Code duplicated, block: B:436:0x067b  */
    /* JADX WARN: Code duplicated, block: B:438:0x0683  */
    /* JADX WARN: Code duplicated, block: B:439:0x0687  */
    /* JADX WARN: Code duplicated, block: B:441:0x068f  */
    /* JADX WARN: Code duplicated, block: B:442:0x0693  */
    /* JADX WARN: Code duplicated, block: B:444:0x069b  */
    /* JADX WARN: Code duplicated, block: B:445:0x069f  */
    /* JADX WARN: Code duplicated, block: B:447:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:448:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:450:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:451:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:453:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:454:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:456:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:457:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:459:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:460:0x06db  */
    /* JADX WARN: Code duplicated, block: B:462:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:463:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:465:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:466:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:468:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:469:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:471:0x0707  */
    /* JADX WARN: Code duplicated, block: B:472:0x070b  */
    /* JADX WARN: Code duplicated, block: B:474:0x0713  */
    /* JADX WARN: Code duplicated, block: B:475:0x0717  */
    /* JADX WARN: Code duplicated, block: B:477:0x071f  */
    /* JADX WARN: Code duplicated, block: B:478:0x0723  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[Catch: all -> 0x07a7, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x079f, B:44:0x0087, B:47:0x0092, B:82:0x0101, B:507:0x078a, B:516:0x07a3), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:480:0x072b  */
    /* JADX WARN: Code duplicated, block: B:481:0x072e  */
    /* JADX WARN: Code duplicated, block: B:483:0x0736  */
    /* JADX WARN: Code duplicated, block: B:484:0x0739  */
    /* JADX WARN: Code duplicated, block: B:486:0x0741  */
    /* JADX WARN: Code duplicated, block: B:487:0x0744  */
    /* JADX WARN: Code duplicated, block: B:489:0x074c  */
    /* JADX WARN: Code duplicated, block: B:490:0x074f  */
    /* JADX WARN: Code duplicated, block: B:492:0x0757  */
    /* JADX WARN: Code duplicated, block: B:493:0x075a  */
    /* JADX WARN: Code duplicated, block: B:495:0x0762  */
    /* JADX WARN: Code duplicated, block: B:496:0x0765  */
    /* JADX WARN: Code duplicated, block: B:498:0x076d  */
    /* JADX WARN: Code duplicated, block: B:499:0x0770  */
    /* JADX WARN: Code duplicated, block: B:501:0x0778  */
    /* JADX WARN: Code duplicated, block: B:502:0x077b  */
    /* JADX WARN: Code duplicated, block: B:504:0x0783  */
    /* JADX WARN: Code duplicated, block: B:505:0x0786  */
    /* JADX WARN: Code duplicated, block: B:507:0x078a A[Catch: all -> 0x07a7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x079f, B:44:0x0087, B:47:0x0092, B:82:0x0101, B:507:0x078a, B:516:0x07a3), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:511:0x0794  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00db  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101 A[Catch: all -> 0x07a7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x079f, B:44:0x0087, B:47:0x0092, B:82:0x0101, B:507:0x078a, B:516:0x07a3), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:88:0x0118  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:91:0x0124  */
    /* JADX WARN: Code duplicated, block: B:93:0x012c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:96:0x0138  */
    /* JADX WARN: Code duplicated, block: B:97:0x013c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0144  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean zzaK(String str) {
        String str2;
        byte b10;
        String str3;
        byte b11;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (zzyu.class) {
            if (!zzc) {
                int i10 = zzfj.zza;
                byte b12 = Ascii.FS;
                byte b13 = -1;
                if (i10 <= 28) {
                    String str4 = zzfj.zzb;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b11 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b11 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b11 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b11 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b11 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b11 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b11 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b11 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        default:
                            if (i10 <= 27 || !"HWEML".equals(zzfj.zzb)) {
                                str2 = zzfj.zzd;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b10 = -1;
                                        } else {
                                            b10 = 5;
                                        }
                                        break;
                                    default:
                                        b10 = -1;
                                        break;
                                }
                                switch (b10) {
                                    default:
                                        if (i10 <= 26) {
                                            str3 = zzfj.zzb;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Ascii.US;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Ascii.DEL;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b12 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Ascii.RS;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Ascii.EM;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 61;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Ascii.CAN;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = Ascii.GS;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 63;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b12 = -1;
                                                    } else {
                                                        b12 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b12 = -1;
                                                    break;
                                            }
                                            switch (b12) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                        b13 = 0;
                                                    }
                                                    if (b13 == 0) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                                case 137:
                                                case 138:
                                                case 139:
                                                    z10 = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z10 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z10 = true;
                            break;
                    }
                } else if (i10 <= 27) {
                    str2 = zzfj.zzd;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b10 = -1;
                            } else {
                                b10 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b10 = -1;
                            } else {
                                b10 = 5;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i10 <= 26) {
                                str3 = zzfj.zzb;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.US;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.DEL;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b12 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.RS;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.EM;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.CAN;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.GS;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 66;
                                        }
                                        break;
                                    default:
                                        b12 = -1;
                                        break;
                                }
                                switch (b12) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            b13 = 0;
                                        }
                                        if (b13 == 0) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z10 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z10 = true;
                            break;
                    }
                } else {
                    str2 = zzfj.zzd;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b10 = -1;
                            } else {
                                b10 = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b10 = -1;
                            } else {
                                b10 = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b10 = -1;
                            } else {
                                b10 = 5;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            if (i10 <= 26) {
                                str3 = zzfj.zzb;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.US;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.DEL;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b12 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.RS;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.EM;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 61;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.CAN;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b12 = -1;
                                        } else {
                                            b12 = Ascii.GS;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 63;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b12 = -1;
                                        } else {
                                            b12 = 66;
                                        }
                                        break;
                                    default:
                                        b12 = -1;
                                        break;
                                }
                                switch (b12) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            b13 = 0;
                                        }
                                        if (b13 == 0) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                    case 137:
                                    case 138:
                                    case 139:
                                        z10 = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z10 = true;
                            break;
                    }
                }
                zzd = z10;
                zzc = true;
            }
        }
        return zzd;
    }

    private static List zzaL(Context context, zzry zzryVar, zzam zzamVar, boolean z10, boolean z11) throws zzsf {
        String str = zzamVar.zzm;
        if (str == null) {
            return zzfsc.zzl();
        }
        if (zzfj.zza >= 26 && "video/dolby-vision".equals(str) && !zzyl.zza(context)) {
            List listZzf = zzsl.zzf(zzryVar, zzamVar, z10, z11);
            if (!listZzf.isEmpty()) {
                return listZzf;
            }
        }
        return zzsl.zzh(zzryVar, zzamVar, z10, z11);
    }

    private final void zzaM(zzdn zzdnVar) {
        if (zzdnVar.equals(zzdn.zza) || zzdnVar.equals(this.zzF)) {
            return;
        }
        this.zzF = zzdnVar;
        this.zzg.zzt(zzdnVar);
    }

    private final void zzaN() {
        zzdn zzdnVar = this.zzF;
        if (zzdnVar != null) {
            this.zzg.zzt(zzdnVar);
        }
    }

    private final void zzaO() {
        Surface surface = this.zzm;
        zzyx zzyxVar = this.zzn;
        if (surface == zzyxVar) {
            this.zzm = null;
        }
        zzyxVar.release();
        this.zzn = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzaP() {
        return zzfj.zza >= 21;
    }

    private static boolean zzaQ(long j10) {
        return j10 < -30000;
    }

    private final boolean zzaR(zzrs zzrsVar) {
        return zzfj.zza >= 23 && !zzaK(zzrsVar.zza) && (!zzrsVar.zzf || zzyx.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzli
    public final void zzG(float f10, float f11) throws zzih {
        super.zzG(f10, f11);
        this.zzf.zze(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzli, com.google.android.gms.internal.ads.zzlk
    public final String zzN() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzli
    public final boolean zzQ() {
        zzyx zzyxVar;
        if (super.zzQ() && (this.zzq || (((zzyxVar = this.zzn) != null && this.zzm == zzyxVar) || zzan() == null))) {
            this.zzu = -9223372036854775807L;
            return true;
        }
        if (this.zzu == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.zzu) {
            return true;
        }
        this.zzu = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final float zzS(float f10, zzam zzamVar, zzam[] zzamVarArr) {
        float fMax = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f11 = zzamVar2.zzt;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zzT(zzry zzryVar, zzam zzamVar) throws zzsf {
        boolean z10;
        if (!zzcc.zzg(zzamVar.zzm)) {
            return 128;
        }
        int i10 = 0;
        boolean z11 = zzamVar.zzp != null;
        List listZzaL = zzaL(this.zze, zzryVar, zzamVar, z11, false);
        if (z11 && listZzaL.isEmpty()) {
            listZzaL = zzaL(this.zze, zzryVar, zzamVar, false, false);
        }
        if (listZzaL.isEmpty()) {
            return 129;
        }
        if (!zzrw.zzaB(zzamVar)) {
            return 130;
        }
        zzrs zzrsVar = (zzrs) listZzaL.get(0);
        boolean zZze = zzrsVar.zze(zzamVar);
        if (!zZze) {
            int i11 = 1;
            while (true) {
                if (i11 >= listZzaL.size()) {
                    z10 = true;
                    break;
                }
                zzrs zzrsVar2 = (zzrs) listZzaL.get(i11);
                if (zzrsVar2.zze(zzamVar)) {
                    zZze = true;
                    z10 = false;
                    zzrsVar = zzrsVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = true != zZze ? 3 : 4;
        int i13 = true != zzrsVar.zzf(zzamVar) ? 8 : 16;
        int i14 = true != zzrsVar.zzg ? 0 : 64;
        int i15 = true != z10 ? 0 : 128;
        if (zzfj.zza >= 26 && "video/dolby-vision".equals(zzamVar.zzm) && !zzyl.zza(this.zze)) {
            i15 = 256;
        }
        if (zZze) {
            List listZzaL2 = zzaL(this.zze, zzryVar, zzamVar, z11, true);
            if (!listZzaL2.isEmpty()) {
                zzrs zzrsVar3 = (zzrs) zzsl.zzi(listZzaL2, zzamVar).get(0);
                if (zzrsVar3.zze(zzamVar) && zzrsVar3.zzf(zzamVar)) {
                    i10 = 32;
                }
            }
        }
        return i12 | i13 | i10 | i14 | i15;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzia zzU(zzrs zzrsVar, zzam zzamVar, zzam zzamVar2) {
        int i10;
        int i11;
        zzia zziaVarZzb = zzrsVar.zzb(zzamVar, zzamVar2);
        int i12 = zziaVarZzb.zze;
        int i13 = zzamVar2.zzr;
        zzym zzymVar = this.zzj;
        if (i13 > zzymVar.zza || zzamVar2.zzs > zzymVar.zzb) {
            i12 |= 256;
        }
        if (zzX(zzrsVar, zzamVar2) > this.zzj.zzc) {
            i12 |= 64;
        }
        String str = zzrsVar.zza;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = zziaVarZzb.zzd;
        }
        return new zzia(str, zzamVar, zzamVar2, i11, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzia zzV(zzkj zzkjVar) throws zzih {
        zzia zziaVarZzV = super.zzV(zzkjVar);
        this.zzg.zzf(zzkjVar.zza, zziaVarZzV);
        return zziaVarZzV;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    @TargetApi(17)
    public final zzrn zzY(zzrs zzrsVar, zzam zzamVar, MediaCrypto mediaCrypto, float f10) {
        String str;
        zzym zzymVar;
        Point point;
        int i10;
        Pair pairZzb;
        int iZzW;
        zzyx zzyxVar = this.zzn;
        if (zzyxVar != null && zzyxVar.zza != zzrsVar.zzf) {
            zzaO();
        }
        String str2 = zzrsVar.zzc;
        zzam[] zzamVarArrZzM = zzM();
        int iMax = zzamVar.zzr;
        int iMax2 = zzamVar.zzs;
        int iZzX = zzX(zzrsVar, zzamVar);
        int length = zzamVarArrZzM.length;
        if (length == 1) {
            if (iZzX != -1 && (iZzW = zzW(zzrsVar, zzamVar)) != -1) {
                iZzX = Math.min((int) (iZzX * 1.5f), iZzW);
            }
            zzymVar = new zzym(iMax, iMax2, iZzX);
            str = str2;
        } else {
            boolean z10 = false;
            for (int i11 = 0; i11 < length; i11++) {
                zzam zzamVarZzY = zzamVarArrZzM[i11];
                if (zzamVar.zzy != null && zzamVarZzY.zzy == null) {
                    zzak zzakVarZzb = zzamVarZzY.zzb();
                    zzakVarZzb.zzy(zzamVar.zzy);
                    zzamVarZzY = zzakVarZzb.zzY();
                }
                if (zzrsVar.zzb(zzamVar, zzamVarZzY).zzd != 0) {
                    int i12 = zzamVarZzY.zzr;
                    z10 |= i12 == -1 || zzamVarZzY.zzs == -1;
                    iMax = Math.max(iMax, i12);
                    iMax2 = Math.max(iMax2, zzamVarZzY.zzs);
                    iZzX = Math.max(iZzX, zzX(zzrsVar, zzamVarZzY));
                }
            }
            if (z10) {
                zzer.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i13 = zzamVar.zzs;
                int i14 = zzamVar.zzr;
                boolean z11 = i13 > i14;
                int i15 = z11 ? i13 : i14;
                if (true == z11) {
                    i13 = i14;
                }
                int[] iArr = zzb;
                int i16 = 0;
                while (true) {
                    if (i16 < 9) {
                        float f11 = i13;
                        float f12 = i15;
                        str = str2;
                        int i17 = iArr[i16];
                        int[] iArr2 = iArr;
                        float f13 = i17;
                        if (i17 > i15 && (i10 = (int) ((f11 / f12) * f13)) > i13) {
                            if (zzfj.zza < 21) {
                                try {
                                    int i18 = ((i17 + 15) / 16) * 16;
                                    int i19 = ((i10 + 15) / 16) * 16;
                                    if (i18 * i19 <= zzsl.zza()) {
                                        int i20 = true != z11 ? i18 : i19;
                                        if (true != z11) {
                                            i18 = i19;
                                        }
                                        point = new Point(i20, i18);
                                        break;
                                    }
                                    i16++;
                                    str2 = str;
                                    iArr = iArr2;
                                } catch (zzsf unused) {
                                    point = null;
                                    break;
                                }
                            } else {
                                int i21 = true != z11 ? i17 : i10;
                                if (true != z11) {
                                    i17 = i10;
                                }
                                Point pointZza = zzrsVar.zza(i21, i17);
                                if (zzrsVar.zzg(pointZza.x, pointZza.y, zzamVar.zzt)) {
                                    point = pointZza;
                                    break;
                                }
                                i16++;
                                str2 = str;
                                iArr = iArr2;
                            }
                        }
                    } else {
                        str = str2;
                    }
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    zzak zzakVarZzb2 = zzamVar.zzb();
                    zzakVarZzb2.zzX(iMax);
                    zzakVarZzb2.zzF(iMax2);
                    iZzX = Math.max(iZzX, zzW(zzrsVar, zzakVarZzb2.zzY()));
                    zzer.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                str = str2;
            }
            zzymVar = new zzym(iMax, iMax2, iZzX);
        }
        this.zzj = zzymVar;
        boolean z12 = this.zzi;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzamVar.zzr);
        mediaFormat.setInteger("height", zzamVar.zzs);
        zzet.zzb(mediaFormat, zzamVar.zzo);
        float f14 = zzamVar.zzt;
        if (f14 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f14);
        }
        zzet.zza(mediaFormat, "rotation-degrees", zzamVar.zzu);
        zzs zzsVar = zzamVar.zzy;
        if (zzsVar != null) {
            zzet.zza(mediaFormat, "color-transfer", zzsVar.zzf);
            zzet.zza(mediaFormat, "color-standard", zzsVar.zzd);
            zzet.zza(mediaFormat, "color-range", zzsVar.zze);
            byte[] bArr = zzsVar.zzg;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzamVar.zzm) && (pairZzb = zzsl.zzb(zzamVar)) != null) {
            zzet.zza(mediaFormat, Scopes.PROFILE, ((Integer) pairZzb.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzymVar.zza);
        mediaFormat.setInteger("max-height", zzymVar.zzb);
        zzet.zza(mediaFormat, "max-input-size", zzymVar.zzc);
        if (zzfj.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z12) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzm == null) {
            if (!zzaR(zzrsVar)) {
                throw new IllegalStateException();
            }
            if (this.zzn == null) {
                this.zzn = zzyx.zza(this.zze, zzrsVar.zzf);
            }
            this.zzm = this.zzn;
        }
        return zzrn.zzb(zzrsVar, mediaFormat, zzamVar, this.zzm, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final List zzZ(zzry zzryVar, zzam zzamVar, boolean z10) throws zzsf {
        return zzsl.zzi(zzaL(this.zze, zzryVar, zzamVar, false, false), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzaA(zzrs zzrsVar) {
        return this.zzm != null || zzaR(zzrsVar);
    }

    public final void zzaD() {
        this.zzs = true;
        if (this.zzq) {
            return;
        }
        this.zzq = true;
        this.zzg.zzq(this.zzm);
        this.zzo = true;
    }

    public final void zzaE(zzrp zzrpVar, int i10, long j10) {
        int i11 = zzfj.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrpVar.zzn(i10, true);
        Trace.endSection();
        ((zzrw) this).zza.zze++;
        this.zzx = 0;
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        zzaM(this.zzE);
        zzaD();
    }

    public final void zzaF(zzrp zzrpVar, int i10, long j10, long j11) {
        int i11 = zzfj.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzrpVar.zzm(i10, j11);
        Trace.endSection();
        ((zzrw) this).zza.zze++;
        this.zzx = 0;
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        zzaM(this.zzE);
        zzaD();
    }

    public final void zzaG(zzrp zzrpVar, int i10, long j10) {
        int i11 = zzfj.zza;
        Trace.beginSection("skipVideoBuffer");
        zzrpVar.zzn(i10, false);
        Trace.endSection();
        ((zzrw) this).zza.zzf++;
    }

    public final void zzaH(int i10, int i11) {
        zzhz zzhzVar = ((zzrw) this).zza;
        zzhzVar.zzh += i10;
        int i12 = i10 + i11;
        zzhzVar.zzg += i12;
        this.zzw += i12;
        int i13 = this.zzx + i12;
        this.zzx = i13;
        zzhzVar.zzi = Math.max(i13, zzhzVar.zzi);
    }

    public final void zzaI(long j10) {
        zzhz zzhzVar = ((zzrw) this).zza;
        zzhzVar.zzk += j10;
        zzhzVar.zzl++;
        this.zzB += j10;
        this.zzC++;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzaa(Exception exc) {
        zzer.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzab(String str, zzrn zzrnVar, long j10, long j11) {
        this.zzg.zza(str, j10, j11);
        this.zzk = zzaK(str);
        zzrs zzrsVarZzap = zzap();
        Objects.requireNonNull(zzrsVarZzap);
        boolean z10 = false;
        if (zzfj.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzrsVarZzap.zzb)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzrsVarZzap.zzh()) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.zzl = z10;
        this.zzh.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzac(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzad(zzam zzamVar, MediaFormat mediaFormat) {
        zzrp zzrpVarZzan = zzan();
        if (zzrpVarZzan != null) {
            zzrpVarZzan.zzq(this.zzp);
        }
        Objects.requireNonNull(mediaFormat);
        int i10 = 0;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f10 = zzamVar.zzv;
        if (zzaP()) {
            int i11 = zzamVar.zzu;
            if (i11 == 90 || i11 == 270) {
                f10 = 1.0f / f10;
                int i12 = integer2;
                integer2 = integer;
                integer = i12;
            }
        } else {
            i10 = zzamVar.zzu;
        }
        this.zzE = new zzdn(integer, integer2, i10, f10);
        this.zzf.zzc(zzamVar.zzt);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzaf(long j10) {
        super.zzaf(j10);
        this.zzy--;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzag() {
        this.zzq = false;
        int i10 = zzfj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzah(zzhp zzhpVar) throws zzih {
        this.zzy++;
        int i10 = zzfj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzaj(long j10, long j11, zzrp zzrpVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzam zzamVar) throws zzih {
        int iZzd;
        Objects.requireNonNull(zzrpVar);
        if (this.zzt == -9223372036854775807L) {
            this.zzt = j10;
        }
        if (j12 != this.zzz) {
            this.zzf.zzd(j12);
            this.zzz = j12;
        }
        long jZzam = j12 - zzam();
        if (z10 && !z11) {
            zzaG(zzrpVar, i10, jZzam);
            return true;
        }
        int iZzbc = zzbc();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long jZzal = (long) ((j12 - j10) / ((double) zzal()));
        if (iZzbc == 2) {
            jZzal -= jElapsedRealtime - j11;
        }
        if (this.zzm == this.zzn) {
            if (!zzaQ(jZzal)) {
                return false;
            }
            zzaG(zzrpVar, i10, jZzam);
            zzaI(jZzal);
            return true;
        }
        int iZzbc2 = zzbc();
        boolean z12 = this.zzs;
        boolean z13 = iZzbc2 == 2;
        boolean z14 = z12 ? !this.zzq : z13 || this.zzr;
        long jElapsedRealtime2 = (SystemClock.elapsedRealtime() * 1000) - this.zzA;
        if (this.zzu == -9223372036854775807L && j10 >= zzam() && (z14 || (z13 && zzaQ(jZzal) && jElapsedRealtime2 > 100000))) {
            long jNanoTime = System.nanoTime();
            if (zzfj.zza >= 21) {
                zzaF(zzrpVar, i10, jZzam, jNanoTime);
            } else {
                zzaE(zzrpVar, i10, jZzam);
            }
            zzaI(jZzal);
            return true;
        }
        if (iZzbc != 2 || j10 == this.zzt) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jZza = this.zzf.zza((jZzal * 1000) + jNanoTime2);
        long j13 = (jZza - jNanoTime2) / 1000;
        long j14 = this.zzu;
        if (j13 < -500000 && !z11 && (iZzd = zzd(j10)) != 0) {
            if (j14 != -9223372036854775807L) {
                zzhz zzhzVar = ((zzrw) this).zza;
                zzhzVar.zzd += iZzd;
                zzhzVar.zzf += this.zzy;
            } else {
                ((zzrw) this).zza.zzj++;
                zzaH(iZzd, this.zzy);
            }
            zzaw();
            return false;
        }
        if (zzaQ(j13) && !z11) {
            if (j14 != -9223372036854775807L) {
                zzaG(zzrpVar, i10, jZzam);
            } else {
                int i13 = zzfj.zza;
                Trace.beginSection("dropVideoBuffer");
                zzrpVar.zzn(i10, false);
                Trace.endSection();
                zzaH(0, 1);
            }
            zzaI(j13);
            return true;
        }
        if (zzfj.zza >= 21) {
            if (j13 >= 50000) {
                return false;
            }
            if (jZza == this.zzD) {
                zzaG(zzrpVar, i10, jZzam);
            } else {
                zzaF(zzrpVar, i10, jZzam, jZza);
            }
            zzaI(j13);
            this.zzD = jZza;
            return true;
        }
        if (j13 >= 30000) {
            return false;
        }
        if (j13 > 11000) {
            try {
                Thread.sleep(((-10000) + j13) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        zzaE(zzrpVar, i10, jZzam);
        zzaI(j13);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzrq zzao(Throwable th, zzrs zzrsVar) {
        return new zzyk(th, zzrsVar, this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    @TargetApi(29)
    public final void zzaq(zzhp zzhpVar) throws zzih {
        if (this.zzl) {
            ByteBuffer byteBuffer = zzhpVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zzrp zzrpVarZzan = zzan();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzrpVarZzan.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzas(zzam zzamVar) throws zzih {
        this.zzh.zzd(zzamVar, zzam());
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzau() {
        super.zzau();
        this.zzy = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzrp] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.google.android.gms.internal.ads.zzzf] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.gms.internal.ads.zzyx] */
    /* JADX WARN: Type inference failed for: r7v7 */
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
    @Override // com.google.android.gms.internal.ads.zzhy, com.google.android.gms.internal.ads.zzle
    public final void zzq(int i10, Object obj) throws zzih {
        ?? Zza;
        Surface surface;
        Surface surface2;
        if (i10 != 1) {
            if (i10 == 7) {
                this.zzH = (zzyy) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.zzG != iIntValue) {
                    this.zzG = iIntValue;
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.zzp = iIntValue2;
                zzrp zzrpVarZzan = zzan();
                if (zzrpVarZzan != null) {
                    zzrpVarZzan.zzq(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            }
            if (i10 == 13) {
                Objects.requireNonNull(obj);
                this.zzh.zzc((List) obj);
                return;
            } else {
                if (i10 != 14) {
                    return;
                }
                Objects.requireNonNull(obj);
                zzfb zzfbVar = (zzfb) obj;
                if (zzfbVar.zzb() == 0 || zzfbVar.zza() == 0 || (surface2 = this.zzm) == null) {
                    return;
                }
                this.zzh.zzb(surface2, zzfbVar);
                return;
            }
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            Zza = 0;
        }
        if (Zza == 0) {
            zzyx zzyxVar = this.zzn;
            if (zzyxVar != null) {
                Zza = surface;
                Zza = zzyxVar;
            } else {
                zzrs zzrsVarZzap = zzap();
                if (zzrsVarZzap != null && zzaR(zzrsVarZzap)) {
                    Zza = surface;
                    Zza = zzyx.zza(this.zze, zzrsVarZzap.zzf);
                    this.zzn = Zza;
                }
            }
        }
        Zza = surface;
        Zza = surface;
        Zza = surface;
        if (this.zzm == Zza) {
            if (Zza == 0 || Zza == this.zzn) {
                return;
            }
            zzaN();
            if (this.zzo) {
                this.zzg.zzq(this.zzm);
                return;
            }
            return;
        }
        this.zzm = Zza;
        this.zzf.zzi(Zza);
        this.zzo = false;
        int iZzbc = zzbc();
        ?? Zzan = zzan();
        if (Zzan != 0) {
            if (zzfj.zza < 23 || Zza == 0 || this.zzk) {
                zzat();
                zzar();
            } else {
                Zzan.zzo(Zza);
            }
        }
        if (Zza == 0 || Zza == this.zzn) {
            this.zzF = null;
            this.zzq = false;
            int i11 = zzfj.zza;
        } else {
            zzaN();
            this.zzq = false;
            int i12 = zzfj.zza;
            if (iZzbc == 2) {
                this.zzu = -9223372036854775807L;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzt() {
        this.zzF = null;
        this.zzq = false;
        int i10 = zzfj.zza;
        this.zzo = false;
        try {
            super.zzt();
        } finally {
            this.zzg.zzc(((zzrw) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzu(boolean z10, boolean z11) throws zzih {
        super.zzu(z10, z11);
        zzk();
        this.zzg.zze(((zzrw) this).zza);
        this.zzr = z11;
        this.zzs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    public final void zzv(long j10, boolean z10) throws zzih {
        super.zzv(j10, z10);
        this.zzq = false;
        int i10 = zzfj.zza;
        this.zzf.zzf();
        this.zzz = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzx = 0;
        this.zzu = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzrw, com.google.android.gms.internal.ads.zzhy
    @TargetApi(17)
    public final void zzw() {
        try {
            super.zzw();
            if (this.zzn != null) {
            }
        } finally {
            if (this.zzn != null) {
                zzaO();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzx() {
        this.zzw = 0;
        this.zzv = SystemClock.elapsedRealtime();
        this.zzA = SystemClock.elapsedRealtime() * 1000;
        this.zzB = 0L;
        this.zzC = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzy() {
        this.zzu = -9223372036854775807L;
        if (this.zzw > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzw, jElapsedRealtime - this.zzv);
            this.zzw = 0;
            this.zzv = jElapsedRealtime;
        }
        int i10 = this.zzC;
        if (i10 != 0) {
            this.zzg.zzr(this.zzB, i10);
            this.zzB = 0L;
            this.zzC = 0;
        }
        this.zzf.zzh();
    }
}
