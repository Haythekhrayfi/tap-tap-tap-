package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends zzkn {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzkz zzkzVar) {
        super(zzkzVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i10, int i11) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i10));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0299 A[Catch: all -> 0x02cd, SQLiteException -> 0x02d0, LOOP:11: B:100:0x0299->B:504:?, LOOP_START, TryCatch #25 {all -> 0x02cd, blocks: (B:98:0x0293, B:100:0x0299, B:102:0x02aa, B:103:0x02b2, B:106:0x02c8, B:116:0x02d8), top: B:457:0x0283 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x02aa A[Catch: all -> 0x02cd, SQLiteException -> 0x02d0, TryCatch #25 {all -> 0x02cd, blocks: (B:98:0x0293, B:100:0x0299, B:102:0x02aa, B:103:0x02b2, B:106:0x02c8, B:116:0x02d8), top: B:457:0x0283 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x02c8 A[Catch: all -> 0x02cd, SQLiteException -> 0x02d0, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x02cd, blocks: (B:98:0x0293, B:100:0x0299, B:102:0x02aa, B:103:0x02b2, B:106:0x02c8, B:116:0x02d8), top: B:457:0x0283 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0307  */
    /* JADX WARN: Code duplicated, block: B:125:0x0315  */
    /* JADX WARN: Code duplicated, block: B:127:0x0331  */
    /* JADX WARN: Code duplicated, block: B:168:0x0454  */
    /* JADX WARN: Code duplicated, block: B:170:0x0458  */
    /* JADX WARN: Code duplicated, block: B:174:0x0465  */
    /* JADX WARN: Code duplicated, block: B:176:0x048a  */
    /* JADX WARN: Code duplicated, block: B:182:0x049f  */
    /* JADX WARN: Code duplicated, block: B:186:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:187:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:191:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:197:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:204:0x0517  */
    /* JADX WARN: Code duplicated, block: B:207:0x0520  */
    /* JADX WARN: Code duplicated, block: B:209:0x052a  */
    /* JADX WARN: Code duplicated, block: B:211:0x0550  */
    /* JADX WARN: Code duplicated, block: B:212:0x0554  */
    /* JADX WARN: Code duplicated, block: B:217:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:242:0x060b  */
    /* JADX WARN: Code duplicated, block: B:245:0x0620  */
    /* JADX WARN: Code duplicated, block: B:249:0x0644  */
    /* JADX WARN: Code duplicated, block: B:250:0x0683  */
    /* JADX WARN: Code duplicated, block: B:253:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:259:0x071d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0745  */
    /* JADX WARN: Code duplicated, block: B:268:0x0750  */
    /* JADX WARN: Code duplicated, block: B:275:0x0777 A[LOOP:8: B:260:0x071f->B:275:0x0777, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:278:0x077e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0786 A[PHI: r0 r5 r22 r28 r29
  0x0786: PHI (r0v92 java.util.Map) = (r0v94 java.util.Map), (r0v101 java.util.Map) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r5v33 android.database.Cursor) = (r5v34 android.database.Cursor), (r5v36 android.database.Cursor) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r22v13 com.google.android.gms.measurement.internal.zzas) = (r22v14 com.google.android.gms.measurement.internal.zzas), (r22v18 com.google.android.gms.measurement.internal.zzas) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r28v7 java.lang.String) = (r28v8 java.lang.String), (r28v11 java.lang.String) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r29v8 java.lang.String) = (r29v9 java.lang.String), (r29v11 java.lang.String) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:305:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:311:0x080e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0837 A[LOOP:10: B:309:0x0808->B:313:0x0837, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:321:0x086c  */
    /* JADX WARN: Code duplicated, block: B:324:0x087b  */
    /* JADX WARN: Code duplicated, block: B:326:0x088e  */
    /* JADX WARN: Code duplicated, block: B:330:0x08d2 A[Catch: SQLiteException -> 0x0939, all -> 0x0960, LOOP:4: B:330:0x08d2->B:345:0x092a, LOOP_START, PHI: r3
  0x08d2: PHI (r3v68 java.util.Iterator) = (r3v61 java.util.Iterator), (r3v70 java.util.Iterator) binds: [B:329:0x08d0, B:345:0x092a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:328:0x08cc, B:330:0x08d2, B:331:0x08d7, B:333:0x08e8, B:335:0x08f8, B:337:0x0903, B:342:0x091f, B:339:0x090a, B:341:0x0918, B:357:0x0944, B:347:0x092f), top: B:425:0x08cc }] */
    /* JADX WARN: Code duplicated, block: B:335:0x08f8 A[Catch: SQLiteException -> 0x0939, all -> 0x0960, TryCatch #0 {all -> 0x0960, blocks: (B:328:0x08cc, B:330:0x08d2, B:331:0x08d7, B:333:0x08e8, B:335:0x08f8, B:337:0x0903, B:342:0x091f, B:339:0x090a, B:341:0x0918, B:357:0x0944, B:347:0x092f), top: B:425:0x08cc }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0901  */
    /* JADX WARN: Code duplicated, block: B:345:0x092a A[LOOP:4: B:330:0x08d2->B:345:0x092a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:346:0x092d  */
    /* JADX WARN: Code duplicated, block: B:366:0x0968  */
    /* JADX WARN: Code duplicated, block: B:370:0x097c  */
    /* JADX WARN: Code duplicated, block: B:373:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:376:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:378:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:380:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:381:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:383:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:395:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:396:0x0a78  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a87 A[PHI: r66
  0x0a87: PHI (r66v6 java.util.Map) = (r66v7 java.util.Map), (r0v122 java.util.Map) binds: [B:399:0x0a85, B:397:0x0a79] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:406:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:411:0x0b16 A[Catch: SQLiteException -> 0x0b2a, TRY_LEAVE, TryCatch #14 {SQLiteException -> 0x0b2a, blocks: (B:409:0x0b0c, B:411:0x0b16), top: B:445:0x0b0c }] */
    /* JADX WARN: Code duplicated, block: B:474:0x0b41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0925 A[EDGE_INSN: B:479:0x0925->B:344:0x0925 BREAK  A[LOOP:4: B:330:0x08d2->B:345:0x092a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x0992 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0a90 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0a59 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0a83 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x062e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0772 A[EDGE_INSN: B:492:0x0772->B:274:0x0772 BREAK  A[LOOP:8: B:260:0x071f->B:275:0x0777], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x07fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x07ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:0x084e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x07d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x0843 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x05cf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x04ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0499 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x04ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:521:0x04dd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x043f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    /* JADX WARN: Code duplicated, block: B:553:0x020f A[EDGE_INSN: B:553:0x020f->B:74:0x020f BREAK  A[LOOP:22: B:63:0x01c3->B:75:0x0215], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0 A[Catch: SQLiteException -> 0x0220, all -> 0x0b46, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:432:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01be A[Catch: SQLiteException -> 0x0220, all -> 0x0b46, TRY_ENTER, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:432:0x01aa }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0215 A[LOOP:22: B:63:0x01c3->B:75:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0249  */
    /* JADX WARN: Code duplicated, block: B:93:0x0254  */
    /* JADX WARN: Code duplicated, block: B:94:0x025c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0267  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v214 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v39, types: [q.a, q.h] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    public final List zza(String str, List list, List list2, Long l10, Long l11) throws Throwable {
        int i10;
        int i11;
        boolean z10;
        ?? r10;
        Map map;
        Cursor cursor;
        String str2;
        Cursor cursorQuery;
        Map map2;
        String str3;
        Map map3;
        Iterator it;
        String str4;
        String str5;
        int iIntValue;
        com.google.android.gms.internal.measurement.zzgh zzghVar;
        BitSet bitSet;
        BitSet bitSet2;
        q.a aVar;
        List<com.google.android.gms.internal.measurement.zzej> list3;
        int i12;
        String str6;
        Long lValueOf;
        String str7;
        ?? aVar2;
        ?? Zzh;
        Cursor cursorRawQuery;
        ?? r11;
        q.a aVar3;
        Iterator it2;
        com.google.android.gms.internal.measurement.zzgh zzghVar2;
        List list4;
        ?? r17;
        Integer numValueOf;
        List arrayList;
        zzw zzwVar;
        q.a aVar4;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzfs zzfsVar;
        com.google.android.gms.internal.measurement.zzfs zzfsVarZza;
        zzam zzamVarZzi;
        String str8;
        String strZzh;
        zzas zzasVarZzn;
        zzas zzasVar;
        long j10;
        String strZzh2;
        Map mapEmptyMap;
        zzas zzasVar2;
        Iterator it4;
        int iIntValue2;
        Set set;
        Integer numValueOf2;
        boolean zZzd;
        zzx zzxVar;
        zzam zzamVarZzi2;
        String str9;
        q.a aVar5;
        String str10;
        String str11;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str12;
        q.a aVar6;
        Iterator it5;
        String strZzf;
        Map mapEmptyMap2;
        String str13;
        String str14;
        Iterator it6;
        int iIntValue3;
        Set set2;
        Integer numValueOf4;
        Iterator it7;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzes zzesVar;
        Integer numValueOf5;
        zzz zzzVar;
        Integer numValueOf6;
        zzam zzamVarZzi3;
        String str15;
        q.a aVar7;
        Cursor cursor2;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List list6;
        List arrayList3;
        String str16;
        ArrayList arrayList4;
        Iterator it8;
        zzam zzamVarZzi4;
        String str17;
        ContentValues contentValues;
        q.a aVar8;
        int i13;
        Cursor cursorQuery4;
        List arrayList5;
        String str18 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new q.a();
        this.zzd = l10;
        this.zze = l11;
        Iterator it9 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it9.hasNext()) {
                z10 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzfs) it9.next()).zzh())) {
                z10 = true;
                break;
            }
        }
        zzny.zzc();
        boolean zZzs = this.zzs.zzf().zzs(this.zza, zzeb.zzW);
        zzny.zzc();
        boolean zZzs2 = this.zzs.zzf().zzs(this.zza, zzeb.zzV);
        if (z10) {
            zzam zzamVarZzi5 = this.zzf.zzi();
            String str19 = this.zza;
            zzamVarZzi5.zzW();
            zzamVarZzi5.zzg();
            Preconditions.checkNotEmpty(str19);
            ContentValues contentValues2 = new ContentValues();
            ?? r12 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                r12 = new String[]{str19};
                zzamVarZzi5.zzh().update("events", contentValues2, "app_id = ?", r12);
                r10 = r12;
            } catch (SQLiteException e10) {
                zzamVarZzi5.zzs.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeo.zzn(str19), e10);
                r10 = r12;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str20 = "Failed to merge filter. appId";
        String str21 = "Database error querying filters. appId";
        String str22 = "data";
        String str23 = "audience_id";
        if (zZzs2 && zZzs) {
            zzam zzamVarZzi6 = this.zzf.zzi();
            String str24 = this.zza;
            Preconditions.checkNotEmpty(str24);
            q.a aVar9 = new q.a();
            try {
                try {
                    cursorQuery4 = zzamVarZzi6.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str24}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery4.getBlob(i11))).zzaE();
                                    if (zzejVar.zzo()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list7 = (List) aVar9.get(numValueOf8);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzejVar);
                                    }
                                } catch (IOException e11) {
                                    zzamVarZzi6.zzs.zzay().zzd().zzc("Failed to merge filter. appId", zzeo.zzn(str24), e11);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = aVar9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        zzamVarZzi6.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzeo.zzn(str24), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        zzam zzamVarZzi7 = this.zzf.zzi();
                        String str25 = this.zza;
                        zzamVarZzi7.zzW();
                        zzamVarZzi7.zzg();
                        Preconditions.checkNotEmpty(str25);
                        cursorQuery = zzamVarZzi7.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str25}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new q.a();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzgh) ((com.google.android.gms.internal.measurement.zzgg) zzlb.zzl(com.google.android.gms.internal.measurement.zzgh.zzf(), cursorQuery.getBlob(1))).zzaE());
                                            str2 = str23;
                                        } catch (IOException e13) {
                                            str2 = str23;
                                            try {
                                                zzamVarZzi7.zzs.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeo.zzn(str25), Integer.valueOf(i13), e13);
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                str22 = str22;
                                                zzamVarZzi7.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzeo.zzn(str25), e);
                                                Map mapEmptyMap4 = Collections.emptyMap();
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = mapEmptyMap4;
                                                if (map2.isEmpty()) {
                                                    str5 = "Database error querying filters. appId";
                                                    str4 = "Failed to merge filter. appId";
                                                } else {
                                                    HashSet hashSet = new HashSet(map2.keySet());
                                                    if (z10) {
                                                        String str26 = this.zza;
                                                        zzam zzamVarZzi8 = this.zzf.zzi();
                                                        str7 = this.zza;
                                                        zzamVarZzi8.zzW();
                                                        zzamVarZzi8.zzg();
                                                        Preconditions.checkNotEmpty(str7);
                                                        aVar2 = new q.a();
                                                        Zzh = zzamVarZzi8.zzh();
                                                        try {
                                                            try {
                                                                cursorRawQuery = Zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) aVar2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                aVar2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        aVar2 = Collections.emptyMap();
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    zzamVarZzi8.zzs.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeo.zzn(str7), e);
                                                                    aVar2 = Collections.emptyMap();
                                                                    r11 = aVar2;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str26);
                                                                    Preconditions.checkNotNull(map2);
                                                                    aVar3 = new q.a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            int iIntValue4 = ((Integer) it2.next()).intValue();
                                                                            Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                                            zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf9);
                                                                            list4 = (List) r11.get(numValueOf9);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r17 = r11;
                                                                            aVar3.put(numValueOf9, zzghVar2);
                                                                            r11 = r17;
                                                                            it2 = it2;
                                                                            str21 = str21;
                                                                        }
                                                                    }
                                                                    str3 = str21;
                                                                    map3 = aVar3;
                                                                    it = hashSet.iterator();
                                                                    while (it.hasNext()) {
                                                                        iIntValue = ((Integer) it.next()).intValue();
                                                                        zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        aVar = new q.a();
                                                                        if (zzghVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzfq zzfqVar : zzghVar.zzj()) {
                                                                                if (zzfqVar.zzh()) {
                                                                                    Integer numValueOf10 = Integer.valueOf(zzfqVar.zza());
                                                                                    if (zzfqVar.zzg()) {
                                                                                        lValueOf = Long.valueOf(zzfqVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    aVar.put(numValueOf10, lValueOf);
                                                                                }
                                                                            }
                                                                        }
                                                                        q.a aVar10 = new q.a();
                                                                        if (zzghVar != null) {
                                                                            for (com.google.android.gms.internal.measurement.zzgj zzgjVar : zzghVar.zzm()) {
                                                                                if (!zzgjVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map4 = map3;
                                                                        if (zzghVar != null) {
                                                                            i12 = 0;
                                                                            while (i12 < zzghVar.zzd() * 64) {
                                                                                if (zzlb.zzv(zzghVar.zzn(), i12)) {
                                                                                    str6 = str20;
                                                                                    this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                                                    bitSet2.set(i12);
                                                                                    if (zzlb.zzv(zzghVar.zzk(), i12)) {
                                                                                        bitSet.set(i12);
                                                                                    }
                                                                                    i12++;
                                                                                    str20 = str6;
                                                                                } else {
                                                                                    str6 = str20;
                                                                                }
                                                                                aVar.remove(Integer.valueOf(i12));
                                                                                i12++;
                                                                                str20 = str6;
                                                                            }
                                                                        }
                                                                        String str27 = str20;
                                                                        Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                                        com.google.android.gms.internal.measurement.zzgh zzghVar3 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf11);
                                                                        if (!zZzs2) {
                                                                        }
                                                                        this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar3, bitSet, bitSet2, aVar, aVar10, null));
                                                                        str20 = str27;
                                                                        map = map;
                                                                        map3 = map4;
                                                                        map2 = map2;
                                                                    }
                                                                    str4 = str20;
                                                                    str5 = str3;
                                                                    if (!list.isEmpty()) {
                                                                        zzwVar = new zzw(this, null);
                                                                        aVar4 = new q.a();
                                                                        it3 = list.iterator();
                                                                        while (it3.hasNext()) {
                                                                            zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                                                                            zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                                                                            if (zzfsVarZza != null) {
                                                                                zzamVarZzi = this.zzf.zzi();
                                                                                str8 = this.zza;
                                                                                strZzh = zzfsVarZza.zzh();
                                                                                zzasVarZzn = zzamVarZzi.zzn(str8, zzfsVar.zzh());
                                                                                if (zzasVarZzn == null) {
                                                                                    zzamVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi.zzs.zzj().zzd(strZzh));
                                                                                    zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                                                                } else {
                                                                                    zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                                                }
                                                                                this.zzf.zzi().zzE(zzasVar);
                                                                                j10 = zzasVar.zzc;
                                                                                strZzh2 = zzfsVarZza.zzh();
                                                                                mapEmptyMap = (Map) aVar4.get(strZzh2);
                                                                                if (mapEmptyMap == null) {
                                                                                    zzamVarZzi2 = this.zzf.zzi();
                                                                                    str9 = this.zza;
                                                                                    zzamVarZzi2.zzW();
                                                                                    zzamVarZzi2.zzg();
                                                                                    Preconditions.checkNotEmpty(str9);
                                                                                    Preconditions.checkNotEmpty(strZzh2);
                                                                                    aVar5 = new q.a();
                                                                                    str10 = str2;
                                                                                    str11 = str22;
                                                                                    try {
                                                                                        try {
                                                                                            str22 = str11;
                                                                                            try {
                                                                                                cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str10, str11}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                                            str2 = str10;
                                                                                                            while (true) {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                        list5 = (List) aVar5.get(numValueOf3);
                                                                                                                        if (list5 == null) {
                                                                                                                            zzasVar2 = zzasVar;
                                                                                                                            try {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                aVar5.put(numValueOf3, arrayList2);
                                                                                                                            } catch (SQLiteException e16) {
                                                                                                                                e = e16;
                                                                                                                                zzamVarZzi2.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str9), e);
                                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                                if (cursorQuery2 != null) {
                                                                                                                                    cursorQuery2.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            zzasVar2 = zzasVar;
                                                                                                                            arrayList2 = list5;
                                                                                                                        }
                                                                                                                        arrayList2.add(zzejVar2);
                                                                                                                    } catch (IOException e17) {
                                                                                                                        zzasVar2 = zzasVar;
                                                                                                                        zzamVarZzi2.zzs.zzay().zzd().zzc(str4, zzeo.zzn(str9), e17);
                                                                                                                    }
                                                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    zzasVar = zzasVar2;
                                                                                                                } catch (SQLiteException e18) {
                                                                                                                    e = e18;
                                                                                                                    zzasVar2 = zzasVar;
                                                                                                                }
                                                                                                            }
                                                                                                            cursorQuery2.close();
                                                                                                            mapEmptyMap = aVar5;
                                                                                                        } else {
                                                                                                            zzasVar2 = zzasVar;
                                                                                                            str2 = str10;
                                                                                                            mapEmptyMap = Collections.emptyMap();
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    zzasVar2 = zzasVar;
                                                                                                    str2 = str10;
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                                zzasVar2 = zzasVar;
                                                                                                str2 = str10;
                                                                                                cursorQuery2 = null;
                                                                                                zzamVarZzi2.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str9), e);
                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                aVar4.put(strZzh2, mapEmptyMap);
                                                                                                it4 = mapEmptyMap.keySet().iterator();
                                                                                                while (it4.hasNext()) {
                                                                                                    iIntValue2 = ((Integer) it4.next()).intValue();
                                                                                                    set = this.zzb;
                                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                    if (set.contains(numValueOf2)) {
                                                                                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                    } else {
                                                                                                        zZzd = true;
                                                                                                        for (com.google.android.gms.internal.measurement.zzej zzejVar3 : (List) mapEmptyMap.get(numValueOf2)) {
                                                                                                            zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j10, zzasVar2, zzf(iIntValue2, zzejVar3.zzb()));
                                                                                                            if (!zZzd) {
                                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                                break;
                                                                                                            }
                                                                                                            zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                                                        }
                                                                                                        if (!zZzd) {
                                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                zzwVar = zzwVar;
                                                                                                it3 = it3;
                                                                                                str18 = str18;
                                                                                            }
                                                                                        } catch (SQLiteException e21) {
                                                                                            e = e21;
                                                                                            str22 = str11;
                                                                                        }
                                                                                        aVar4.put(strZzh2, mapEmptyMap);
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        cursorQuery2 = null;
                                                                                    }
                                                                                } else {
                                                                                    zzasVar2 = zzasVar;
                                                                                }
                                                                                it4 = mapEmptyMap.keySet().iterator();
                                                                                while (it4.hasNext()) {
                                                                                    iIntValue2 = ((Integer) it4.next()).intValue();
                                                                                    set = this.zzb;
                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                    if (set.contains(numValueOf2)) {
                                                                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                    } else {
                                                                                        zZzd = true;
                                                                                        while (r5.hasNext()) {
                                                                                            zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j10, zzasVar2, zzf(iIntValue2, zzejVar3.zzb()));
                                                                                            if (!zZzd) {
                                                                                                this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                                break;
                                                                                            }
                                                                                            zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                                        }
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                zzwVar = zzwVar;
                                                                                it3 = it3;
                                                                                str18 = str18;
                                                                            }
                                                                        }
                                                                    }
                                                                    str12 = str18;
                                                                    if (!list2.isEmpty()) {
                                                                        aVar6 = new q.a();
                                                                        it5 = list2.iterator();
                                                                        while (it5.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) it5.next();
                                                                            strZzf = zzglVar.zzf();
                                                                            mapEmptyMap2 = (Map) aVar6.get(strZzf);
                                                                            if (mapEmptyMap2 == null) {
                                                                                zzamVarZzi3 = this.zzf.zzi();
                                                                                str15 = this.zza;
                                                                                zzamVarZzi3.zzW();
                                                                                zzamVarZzi3.zzg();
                                                                                Preconditions.checkNotEmpty(str15);
                                                                                Preconditions.checkNotEmpty(strZzf);
                                                                                aVar7 = new q.a();
                                                                                str13 = str2;
                                                                                str14 = str22;
                                                                                try {
                                                                                    cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str13, str14}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.zzes zzesVar2 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                                                                        numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                        list6 = (List) aVar7.get(numValueOf7);
                                                                                                        if (list6 == null) {
                                                                                                            arrayList3 = new ArrayList();
                                                                                                            aVar7.put(numValueOf7, arrayList3);
                                                                                                        } else {
                                                                                                            arrayList3 = list6;
                                                                                                        }
                                                                                                        arrayList3.add(zzesVar2);
                                                                                                    } catch (IOException e22) {
                                                                                                        zzamVarZzi3.zzs.zzay().zzd().zzc("Failed to merge filter", zzeo.zzn(str15), e22);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it5 = it5;
                                                                                                    } catch (SQLiteException e23) {
                                                                                                        e = e23;
                                                                                                        zzamVarZzi3.zzs.zzay().zzd().zzc(str5, zzeo.zzn(str15), e);
                                                                                                        mapEmptyMap2 = Collections.emptyMap();
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery3.close();
                                                                                                mapEmptyMap2 = aVar7;
                                                                                            } else {
                                                                                                it5 = it5;
                                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            cursor2 = cursorQuery3;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e24) {
                                                                                        e = e24;
                                                                                        it5 = it5;
                                                                                    }
                                                                                } catch (SQLiteException e25) {
                                                                                    e = e25;
                                                                                    it5 = it5;
                                                                                    cursorQuery3 = null;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    cursor2 = null;
                                                                                }
                                                                                aVar6.put(strZzf, mapEmptyMap2);
                                                                            } else {
                                                                                it5 = it5;
                                                                                str13 = str2;
                                                                                str14 = str22;
                                                                            }
                                                                            it6 = mapEmptyMap2.keySet().iterator();
                                                                            while (it6.hasNext()) {
                                                                                iIntValue3 = ((Integer) it6.next()).intValue();
                                                                                set2 = this.zzb;
                                                                                numValueOf4 = Integer.valueOf(iIntValue3);
                                                                                if (set2.contains(numValueOf4)) {
                                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                                                zZzd2 = true;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        zzesVar = (com.google.android.gms.internal.measurement.zzes) it7.next();
                                                                                        if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                                            zzem zzemVarZzj = this.zzs.zzay().zzj();
                                                                                            Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                                            if (zzesVar.zzj()) {
                                                                                                numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                                            } else {
                                                                                                numValueOf6 = null;
                                                                                            }
                                                                                            zzemVarZzj.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                                            this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                                                        }
                                                                                        if (zzesVar.zzj()) {
                                                                                        }
                                                                                        zzem zzemVarZzk = this.zzs.zzay().zzk();
                                                                                        Object objZzn = zzeo.zzn(this.zza);
                                                                                        if (zzesVar.zzj()) {
                                                                                            numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                                        } else {
                                                                                            numValueOf5 = null;
                                                                                        }
                                                                                        zzemVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf5));
                                                                                        this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                    } else {
                                                                                        mapEmptyMap2 = mapEmptyMap2;
                                                                                    }
                                                                                    if (!zZzd2) {
                                                                                        this.zzb.add(Integer.valueOf(iIntValue3));
                                                                                    }
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                    zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                                }
                                                                            }
                                                                            it5 = it5;
                                                                            str22 = str14;
                                                                            str2 = str13;
                                                                        }
                                                                    }
                                                                    str16 = str2;
                                                                    arrayList4 = new ArrayList();
                                                                    Set setKeySet = this.zzc.keySet();
                                                                    setKeySet.removeAll(this.zzb);
                                                                    it8 = setKeySet.iterator();
                                                                    while (it8.hasNext()) {
                                                                        int iIntValue5 = ((Integer) it8.next()).intValue();
                                                                        Map map5 = this.zzc;
                                                                        Integer numValueOf13 = Integer.valueOf(iIntValue5);
                                                                        zzu zzuVar = (zzu) map5.get(numValueOf13);
                                                                        Preconditions.checkNotNull(zzuVar);
                                                                        com.google.android.gms.internal.measurement.zzfo zzfoVarZza = zzuVar.zza(iIntValue5);
                                                                        arrayList4.add(zzfoVarZza);
                                                                        zzamVarZzi4 = this.zzf.zzi();
                                                                        str17 = this.zza;
                                                                        com.google.android.gms.internal.measurement.zzgh zzghVarZzd = zzfoVarZza.zzd();
                                                                        zzamVarZzi4.zzW();
                                                                        zzamVarZzi4.zzg();
                                                                        Preconditions.checkNotEmpty(str17);
                                                                        Preconditions.checkNotNull(zzghVarZzd);
                                                                        byte[] bArrZzbv = zzghVarZzd.zzbv();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str17);
                                                                        contentValues.put(str16, numValueOf13);
                                                                        String str28 = str12;
                                                                        contentValues.put(str28, bArrZzbv);
                                                                        try {
                                                                            try {
                                                                                if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    zzamVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str17));
                                                                                }
                                                                            } catch (SQLiteException e26) {
                                                                                e = e26;
                                                                                zzamVarZzi4.zzs.zzay().zzd().zzc("Error storing filter results. appId", zzeo.zzn(str17), e);
                                                                            }
                                                                        } catch (SQLiteException e27) {
                                                                            e = e27;
                                                                        }
                                                                        str12 = str28;
                                                                    }
                                                                    return arrayList4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                if (Zzh != 0) {
                                                                    Zzh.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e28) {
                                                            e = e28;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            Zzh = 0;
                                                            if (Zzh != 0) {
                                                                Zzh.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        r11 = aVar2;
                                                        Preconditions.checkNotEmpty(str26);
                                                        Preconditions.checkNotNull(map2);
                                                        aVar3 = new q.a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                int iIntValue6 = ((Integer) it2.next()).intValue();
                                                                Integer numValueOf14 = Integer.valueOf(iIntValue6);
                                                                zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf14);
                                                                list4 = (List) r11.get(numValueOf14);
                                                                if (list4 != null) {
                                                                }
                                                                r17 = r11;
                                                                aVar3.put(numValueOf14, zzghVar2);
                                                                r11 = r17;
                                                                it2 = it2;
                                                                str21 = str21;
                                                            }
                                                        }
                                                        str3 = str21;
                                                        map3 = aVar3;
                                                    } else {
                                                        str3 = "Database error querying filters. appId";
                                                        map3 = map2;
                                                    }
                                                    it = hashSet.iterator();
                                                    while (it.hasNext()) {
                                                        iIntValue = ((Integer) it.next()).intValue();
                                                        zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new q.a();
                                                        if (zzghVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (zzfqVar.zzh()) {
                                                                    Integer numValueOf15 = Integer.valueOf(zzfqVar.zza());
                                                                    if (zzfqVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzfqVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf15, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        q.a aVar11 = new q.a();
                                                        if (zzghVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (!zzgjVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        Map map6 = map3;
                                                        if (zzghVar != null) {
                                                            i12 = 0;
                                                            while (i12 < zzghVar.zzd() * 64) {
                                                                if (zzlb.zzv(zzghVar.zzn(), i12)) {
                                                                    str6 = str20;
                                                                    this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                                    bitSet2.set(i12);
                                                                    if (zzlb.zzv(zzghVar.zzk(), i12)) {
                                                                        bitSet.set(i12);
                                                                    }
                                                                    i12++;
                                                                    str20 = str6;
                                                                } else {
                                                                    str6 = str20;
                                                                }
                                                                aVar.remove(Integer.valueOf(i12));
                                                                i12++;
                                                                str20 = str6;
                                                            }
                                                        }
                                                        String str29 = str20;
                                                        Integer numValueOf16 = Integer.valueOf(iIntValue);
                                                        com.google.android.gms.internal.measurement.zzgh zzghVar4 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf16);
                                                        if (!zZzs2) {
                                                        }
                                                        this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar4, bitSet, bitSet2, aVar, aVar11, null));
                                                        str20 = str29;
                                                        map = map;
                                                        map3 = map6;
                                                        map2 = map2;
                                                    }
                                                    str4 = str20;
                                                    str5 = str3;
                                                }
                                                if (!list.isEmpty()) {
                                                    zzwVar = new zzw(this, null);
                                                    aVar4 = new q.a();
                                                    it3 = list.iterator();
                                                    while (it3.hasNext()) {
                                                        zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                                                        zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                                                        if (zzfsVarZza != null) {
                                                            zzamVarZzi = this.zzf.zzi();
                                                            str8 = this.zza;
                                                            strZzh = zzfsVarZza.zzh();
                                                            zzasVarZzn = zzamVarZzi.zzn(str8, zzfsVar.zzh());
                                                            if (zzasVarZzn == null) {
                                                                zzamVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi.zzs.zzj().zzd(strZzh));
                                                                zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                                            }
                                                            this.zzf.zzi().zzE(zzasVar);
                                                            j10 = zzasVar.zzc;
                                                            strZzh2 = zzfsVarZza.zzh();
                                                            mapEmptyMap = (Map) aVar4.get(strZzh2);
                                                            if (mapEmptyMap == null) {
                                                                zzamVarZzi2 = this.zzf.zzi();
                                                                str9 = this.zza;
                                                                zzamVarZzi2.zzW();
                                                                zzamVarZzi2.zzg();
                                                                Preconditions.checkNotEmpty(str9);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                aVar5 = new q.a();
                                                                str10 = str2;
                                                                str11 = str22;
                                                                str22 = str11;
                                                                cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str10, str11}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                                                                if (cursorQuery2.moveToFirst()) {
                                                                    str2 = str10;
                                                                    while (true) {
                                                                        com.google.android.gms.internal.measurement.zzej zzejVar4 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                        list5 = (List) aVar5.get(numValueOf3);
                                                                        if (list5 == null) {
                                                                            zzasVar2 = zzasVar;
                                                                            arrayList2 = new ArrayList();
                                                                            aVar5.put(numValueOf3, arrayList2);
                                                                        } else {
                                                                            zzasVar2 = zzasVar;
                                                                            arrayList2 = list5;
                                                                        }
                                                                        arrayList2.add(zzejVar4);
                                                                        if (!cursorQuery2.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        zzasVar = zzasVar2;
                                                                    }
                                                                    cursorQuery2.close();
                                                                    mapEmptyMap = aVar5;
                                                                } else {
                                                                    zzasVar2 = zzasVar;
                                                                    str2 = str10;
                                                                    mapEmptyMap = Collections.emptyMap();
                                                                    cursorQuery2.close();
                                                                }
                                                                aVar4.put(strZzh2, mapEmptyMap);
                                                            } else {
                                                                zzasVar2 = zzasVar;
                                                            }
                                                            it4 = mapEmptyMap.keySet().iterator();
                                                            while (it4.hasNext()) {
                                                                iIntValue2 = ((Integer) it4.next()).intValue();
                                                                set = this.zzb;
                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                if (set.contains(numValueOf2)) {
                                                                    this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                } else {
                                                                    zZzd = true;
                                                                    while (r5.hasNext()) {
                                                                        zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j10, zzasVar2, zzf(iIntValue2, zzejVar3.zzb()));
                                                                        if (!zZzd) {
                                                                            this.zzb.add(Integer.valueOf(iIntValue2));
                                                                            break;
                                                                        }
                                                                        zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                                    }
                                                                    if (!zZzd) {
                                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                                    }
                                                                }
                                                            }
                                                            zzwVar = zzwVar;
                                                            it3 = it3;
                                                            str18 = str18;
                                                        }
                                                    }
                                                }
                                                str12 = str18;
                                                if (!list2.isEmpty()) {
                                                    aVar6 = new q.a();
                                                    it5 = list2.iterator();
                                                    while (it5.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzgl zzglVar2 = (com.google.android.gms.internal.measurement.zzgl) it5.next();
                                                        strZzf = zzglVar2.zzf();
                                                        mapEmptyMap2 = (Map) aVar6.get(strZzf);
                                                        if (mapEmptyMap2 == null) {
                                                            zzamVarZzi3 = this.zzf.zzi();
                                                            str15 = this.zza;
                                                            zzamVarZzi3.zzW();
                                                            zzamVarZzi3.zzg();
                                                            Preconditions.checkNotEmpty(str15);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            aVar7 = new q.a();
                                                            str13 = str2;
                                                            str14 = str22;
                                                            cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str13, str14}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.zzes zzesVar3 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                                    numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list6 = (List) aVar7.get(numValueOf7);
                                                                    if (list6 == null) {
                                                                        arrayList3 = new ArrayList();
                                                                        aVar7.put(numValueOf7, arrayList3);
                                                                    } else {
                                                                        arrayList3 = list6;
                                                                    }
                                                                    arrayList3.add(zzesVar3);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it5 = it5;
                                                                }
                                                                cursorQuery3.close();
                                                                mapEmptyMap2 = aVar7;
                                                            } else {
                                                                it5 = it5;
                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                cursorQuery3.close();
                                                            }
                                                            aVar6.put(strZzf, mapEmptyMap2);
                                                        } else {
                                                            it5 = it5;
                                                            str13 = str2;
                                                            str14 = str22;
                                                        }
                                                        it6 = mapEmptyMap2.keySet().iterator();
                                                        while (it6.hasNext()) {
                                                            iIntValue3 = ((Integer) it6.next()).intValue();
                                                            set2 = this.zzb;
                                                            numValueOf4 = Integer.valueOf(iIntValue3);
                                                            if (set2.contains(numValueOf4)) {
                                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                                            zZzd2 = true;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    zzesVar = (com.google.android.gms.internal.measurement.zzes) it7.next();
                                                                    if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                                        zzem zzemVarZzj2 = this.zzs.zzay().zzj();
                                                                        Integer numValueOf17 = Integer.valueOf(iIntValue3);
                                                                        if (zzesVar.zzj()) {
                                                                            numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                        } else {
                                                                            numValueOf6 = null;
                                                                        }
                                                                        zzemVarZzj2.zzd("Evaluating filter. audience, filter, property", numValueOf17, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                                        this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                                    }
                                                                    if (zzesVar.zzj()) {
                                                                    }
                                                                    zzem zzemVarZzk2 = this.zzs.zzay().zzk();
                                                                    Object objZzn2 = zzeo.zzn(this.zza);
                                                                    if (zzesVar.zzj()) {
                                                                        numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                    } else {
                                                                        numValueOf5 = null;
                                                                    }
                                                                    zzemVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf5));
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                } else {
                                                                    mapEmptyMap2 = mapEmptyMap2;
                                                                }
                                                                if (!zZzd2) {
                                                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                                zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                                                mapEmptyMap2 = mapEmptyMap2;
                                                            }
                                                        }
                                                        it5 = it5;
                                                        str22 = str14;
                                                        str2 = str13;
                                                    }
                                                }
                                                str16 = str2;
                                                arrayList4 = new ArrayList();
                                                Set setKeySet2 = this.zzc.keySet();
                                                setKeySet2.removeAll(this.zzb);
                                                it8 = setKeySet2.iterator();
                                                while (it8.hasNext()) {
                                                    int iIntValue7 = ((Integer) it8.next()).intValue();
                                                    Map map7 = this.zzc;
                                                    Integer numValueOf18 = Integer.valueOf(iIntValue7);
                                                    zzu zzuVar2 = (zzu) map7.get(numValueOf18);
                                                    Preconditions.checkNotNull(zzuVar2);
                                                    com.google.android.gms.internal.measurement.zzfo zzfoVarZza2 = zzuVar2.zza(iIntValue7);
                                                    arrayList4.add(zzfoVarZza2);
                                                    zzamVarZzi4 = this.zzf.zzi();
                                                    str17 = this.zza;
                                                    com.google.android.gms.internal.measurement.zzgh zzghVarZzd2 = zzfoVarZza2.zzd();
                                                    zzamVarZzi4.zzW();
                                                    zzamVarZzi4.zzg();
                                                    Preconditions.checkNotEmpty(str17);
                                                    Preconditions.checkNotNull(zzghVarZzd2);
                                                    byte[] bArrZzbv2 = zzghVarZzd2.zzbv();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str17);
                                                    contentValues.put(str16, numValueOf18);
                                                    String str210 = str12;
                                                    contentValues.put(str210, bArrZzbv2);
                                                    if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        zzamVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str17));
                                                    }
                                                    str12 = str210;
                                                }
                                                return arrayList4;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            aVar8 = aVar8;
                                            str23 = str2;
                                            str22 = str22;
                                        } catch (SQLiteException e29) {
                                            e = e29;
                                            zzamVarZzi7.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzeo.zzn(str25), e);
                                            Map mapEmptyMap5 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap5;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = aVar8;
                                } else {
                                    Map mapEmptyMap6 = Collections.emptyMap();
                                    cursorQuery.close();
                                    map2 = mapEmptyMap6;
                                    str2 = "audience_id";
                                    str22 = "data";
                                }
                            } catch (SQLiteException e30) {
                                e = e30;
                                str2 = "audience_id";
                            }
                            if (map2.isEmpty()) {
                                str5 = "Database error querying filters. appId";
                                str4 = "Failed to merge filter. appId";
                            } else {
                                HashSet hashSet2 = new HashSet(map2.keySet());
                                if (z10) {
                                    String str211 = this.zza;
                                    zzam zzamVarZzi9 = this.zzf.zzi();
                                    str7 = this.zza;
                                    zzamVarZzi9.zzW();
                                    zzamVarZzi9.zzg();
                                    Preconditions.checkNotEmpty(str7);
                                    aVar2 = new q.a();
                                    Zzh = zzamVarZzi9.zzh();
                                    cursorRawQuery = Zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                            arrayList = (List) aVar2.get(numValueOf);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                aVar2.put(numValueOf, arrayList);
                                            }
                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        aVar2 = Collections.emptyMap();
                                    }
                                    cursorRawQuery.close();
                                    r11 = aVar2;
                                    Preconditions.checkNotEmpty(str211);
                                    Preconditions.checkNotNull(map2);
                                    aVar3 = new q.a();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            int iIntValue8 = ((Integer) it2.next()).intValue();
                                            Integer numValueOf19 = Integer.valueOf(iIntValue8);
                                            zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf19);
                                            list4 = (List) r11.get(numValueOf19);
                                            if (list4 != null) {
                                            }
                                            r17 = r11;
                                            aVar3.put(numValueOf19, zzghVar2);
                                            r11 = r17;
                                            it2 = it2;
                                            str21 = str21;
                                        }
                                    }
                                    str3 = str21;
                                    map3 = aVar3;
                                } else {
                                    str3 = "Database error querying filters. appId";
                                    map3 = map2;
                                }
                                it = hashSet2.iterator();
                                while (it.hasNext()) {
                                    iIntValue = ((Integer) it.next()).intValue();
                                    zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    aVar = new q.a();
                                    if (zzghVar != null) {
                                        while (r2.hasNext()) {
                                            if (zzfqVar.zzh()) {
                                                Integer numValueOf110 = Integer.valueOf(zzfqVar.zza());
                                                if (zzfqVar.zzg()) {
                                                    lValueOf = Long.valueOf(zzfqVar.zzb());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                aVar.put(numValueOf110, lValueOf);
                                            }
                                        }
                                    }
                                    q.a aVar12 = new q.a();
                                    if (zzghVar != null) {
                                        while (r2.hasNext()) {
                                            if (!zzgjVar.zzi()) {
                                            }
                                        }
                                    }
                                    Map map8 = map3;
                                    if (zzghVar != null) {
                                        i12 = 0;
                                        while (i12 < zzghVar.zzd() * 64) {
                                            if (zzlb.zzv(zzghVar.zzn(), i12)) {
                                                str6 = str20;
                                                this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                                                bitSet2.set(i12);
                                                if (zzlb.zzv(zzghVar.zzk(), i12)) {
                                                    bitSet.set(i12);
                                                }
                                                i12++;
                                                str20 = str6;
                                            } else {
                                                str6 = str20;
                                            }
                                            aVar.remove(Integer.valueOf(i12));
                                            i12++;
                                            str20 = str6;
                                        }
                                    }
                                    String str212 = str20;
                                    Integer numValueOf111 = Integer.valueOf(iIntValue);
                                    com.google.android.gms.internal.measurement.zzgh zzghVar5 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf111);
                                    if (!zZzs2) {
                                    }
                                    this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar5, bitSet, bitSet2, aVar, aVar12, null));
                                    str20 = str212;
                                    map = map;
                                    map3 = map8;
                                    map2 = map2;
                                }
                                str4 = str20;
                                str5 = str3;
                            }
                            if (!list.isEmpty()) {
                                zzwVar = new zzw(this, null);
                                aVar4 = new q.a();
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                                    zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                                    if (zzfsVarZza != null) {
                                        zzamVarZzi = this.zzf.zzi();
                                        str8 = this.zza;
                                        strZzh = zzfsVarZza.zzh();
                                        zzasVarZzn = zzamVarZzi.zzn(str8, zzfsVar.zzh());
                                        if (zzasVarZzn == null) {
                                            zzamVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi.zzs.zzj().zzd(strZzh));
                                            zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                        } else {
                                            zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                                        }
                                        this.zzf.zzi().zzE(zzasVar);
                                        j10 = zzasVar.zzc;
                                        strZzh2 = zzfsVarZza.zzh();
                                        mapEmptyMap = (Map) aVar4.get(strZzh2);
                                        if (mapEmptyMap == null) {
                                            zzamVarZzi2 = this.zzf.zzi();
                                            str9 = this.zza;
                                            zzamVarZzi2.zzW();
                                            zzamVarZzi2.zzg();
                                            Preconditions.checkNotEmpty(str9);
                                            Preconditions.checkNotEmpty(strZzh2);
                                            aVar5 = new q.a();
                                            str10 = str2;
                                            str11 = str22;
                                            str22 = str11;
                                            cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str10, str11}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                str2 = str10;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.zzej zzejVar5 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) aVar5.get(numValueOf3);
                                                    if (list5 == null) {
                                                        zzasVar2 = zzasVar;
                                                        arrayList2 = new ArrayList();
                                                        aVar5.put(numValueOf3, arrayList2);
                                                    } else {
                                                        zzasVar2 = zzasVar;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(zzejVar5);
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    zzasVar = zzasVar2;
                                                }
                                                cursorQuery2.close();
                                                mapEmptyMap = aVar5;
                                            } else {
                                                zzasVar2 = zzasVar;
                                                str2 = str10;
                                                mapEmptyMap = Collections.emptyMap();
                                                cursorQuery2.close();
                                            }
                                            aVar4.put(strZzh2, mapEmptyMap);
                                        } else {
                                            zzasVar2 = zzasVar;
                                        }
                                        it4 = mapEmptyMap.keySet().iterator();
                                        while (it4.hasNext()) {
                                            iIntValue2 = ((Integer) it4.next()).intValue();
                                            set = this.zzb;
                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                            if (set.contains(numValueOf2)) {
                                                this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                            } else {
                                                zZzd = true;
                                                while (r5.hasNext()) {
                                                    zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                                    zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j10, zzasVar2, zzf(iIntValue2, zzejVar3.zzb()));
                                                    if (!zZzd) {
                                                        this.zzb.add(Integer.valueOf(iIntValue2));
                                                        break;
                                                    }
                                                    zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                                                }
                                                if (!zZzd) {
                                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                                }
                                            }
                                        }
                                        zzwVar = zzwVar;
                                        it3 = it3;
                                        str18 = str18;
                                    }
                                }
                            }
                            str12 = str18;
                            if (!list2.isEmpty()) {
                                aVar6 = new q.a();
                                it5 = list2.iterator();
                                while (it5.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzgl zzglVar3 = (com.google.android.gms.internal.measurement.zzgl) it5.next();
                                    strZzf = zzglVar3.zzf();
                                    mapEmptyMap2 = (Map) aVar6.get(strZzf);
                                    if (mapEmptyMap2 == null) {
                                        zzamVarZzi3 = this.zzf.zzi();
                                        str15 = this.zza;
                                        zzamVarZzi3.zzW();
                                        zzamVarZzi3.zzg();
                                        Preconditions.checkNotEmpty(str15);
                                        Preconditions.checkNotEmpty(strZzf);
                                        aVar7 = new q.a();
                                        str13 = str2;
                                        str14 = str22;
                                        cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str13, str14}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            while (true) {
                                                com.google.android.gms.internal.measurement.zzes zzesVar4 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                list6 = (List) aVar7.get(numValueOf7);
                                                if (list6 == null) {
                                                    arrayList3 = new ArrayList();
                                                    aVar7.put(numValueOf7, arrayList3);
                                                } else {
                                                    arrayList3 = list6;
                                                }
                                                arrayList3.add(zzesVar4);
                                                if (!cursorQuery3.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                it5 = it5;
                                            }
                                            cursorQuery3.close();
                                            mapEmptyMap2 = aVar7;
                                        } else {
                                            it5 = it5;
                                            mapEmptyMap2 = Collections.emptyMap();
                                            cursorQuery3.close();
                                        }
                                        aVar6.put(strZzf, mapEmptyMap2);
                                    } else {
                                        it5 = it5;
                                        str13 = str2;
                                        str14 = str22;
                                    }
                                    it6 = mapEmptyMap2.keySet().iterator();
                                    while (it6.hasNext()) {
                                        iIntValue3 = ((Integer) it6.next()).intValue();
                                        set2 = this.zzb;
                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                        if (set2.contains(numValueOf4)) {
                                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                            break;
                                            break;
                                        }
                                        it7 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                                        zZzd2 = true;
                                        while (true) {
                                            if (it7.hasNext()) {
                                                zzesVar = (com.google.android.gms.internal.measurement.zzes) it7.next();
                                                if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                                    zzem zzemVarZzj3 = this.zzs.zzay().zzj();
                                                    Integer numValueOf112 = Integer.valueOf(iIntValue3);
                                                    if (zzesVar.zzj()) {
                                                        numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                    } else {
                                                        numValueOf6 = null;
                                                    }
                                                    zzemVarZzj3.zzd("Evaluating filter. audience, filter, property", numValueOf112, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                                    this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                                }
                                                if (zzesVar.zzj()) {
                                                }
                                                zzem zzemVarZzk3 = this.zzs.zzay().zzk();
                                                Object objZzn3 = zzeo.zzn(this.zza);
                                                if (zzesVar.zzj()) {
                                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                zzemVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf5));
                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                                mapEmptyMap2 = mapEmptyMap2;
                                            } else {
                                                mapEmptyMap2 = mapEmptyMap2;
                                            }
                                            if (!zZzd2) {
                                                this.zzb.add(Integer.valueOf(iIntValue3));
                                            }
                                            mapEmptyMap2 = mapEmptyMap2;
                                            zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                            mapEmptyMap2 = mapEmptyMap2;
                                        }
                                    }
                                    it5 = it5;
                                    str22 = str14;
                                    str2 = str13;
                                }
                            }
                            str16 = str2;
                            arrayList4 = new ArrayList();
                            Set setKeySet3 = this.zzc.keySet();
                            setKeySet3.removeAll(this.zzb);
                            it8 = setKeySet3.iterator();
                            while (it8.hasNext()) {
                                int iIntValue9 = ((Integer) it8.next()).intValue();
                                Map map9 = this.zzc;
                                Integer numValueOf113 = Integer.valueOf(iIntValue9);
                                zzu zzuVar3 = (zzu) map9.get(numValueOf113);
                                Preconditions.checkNotNull(zzuVar3);
                                com.google.android.gms.internal.measurement.zzfo zzfoVarZza3 = zzuVar3.zza(iIntValue9);
                                arrayList4.add(zzfoVarZza3);
                                zzamVarZzi4 = this.zzf.zzi();
                                str17 = this.zza;
                                com.google.android.gms.internal.measurement.zzgh zzghVarZzd3 = zzfoVarZza3.zzd();
                                zzamVarZzi4.zzW();
                                zzamVarZzi4.zzg();
                                Preconditions.checkNotEmpty(str17);
                                Preconditions.checkNotNull(zzghVarZzd3);
                                byte[] bArrZzbv3 = zzghVarZzd3.zzbv();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str17);
                                contentValues.put(str16, numValueOf113);
                                String str213 = str12;
                                contentValues.put(str213, bArrZzbv3);
                                if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    zzamVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str17));
                                }
                                str12 = str213;
                            }
                            return arrayList4;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e31) {
                e = e31;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r10 = 0;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        zzam zzamVarZzi10 = this.zzf.zzi();
        String str214 = this.zza;
        zzamVarZzi10.zzW();
        zzamVarZzi10.zzg();
        Preconditions.checkNotEmpty(str214);
        try {
            cursorQuery = zzamVarZzi10.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str214}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap7 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap7;
                str2 = "audience_id";
                str22 = "data";
            } else {
                aVar8 = new q.a();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzgh) ((com.google.android.gms.internal.measurement.zzgg) zzlb.zzl(com.google.android.gms.internal.measurement.zzgh.zzf(), cursorQuery.getBlob(1))).zzaE());
                    str2 = str23;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    aVar8 = aVar8;
                    str23 = str2;
                    str22 = str22;
                }
                cursorQuery.close();
                map2 = aVar8;
            }
        } catch (SQLiteException e32) {
            e = e32;
            str2 = "audience_id";
            str22 = "data";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (map2.isEmpty()) {
            str5 = "Database error querying filters. appId";
            str4 = "Failed to merge filter. appId";
        } else {
            HashSet hashSet3 = new HashSet(map2.keySet());
            if (z10) {
                String str215 = this.zza;
                zzam zzamVarZzi11 = this.zzf.zzi();
                str7 = this.zza;
                zzamVarZzi11.zzW();
                zzamVarZzi11.zzg();
                Preconditions.checkNotEmpty(str7);
                aVar2 = new q.a();
                Zzh = zzamVarZzi11.zzh();
                cursorRawQuery = Zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) aVar2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    aVar2 = Collections.emptyMap();
                }
                cursorRawQuery.close();
                r11 = aVar2;
                Preconditions.checkNotEmpty(str215);
                Preconditions.checkNotNull(map2);
                aVar3 = new q.a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        int iIntValue10 = ((Integer) it2.next()).intValue();
                        Integer numValueOf114 = Integer.valueOf(iIntValue10);
                        zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf114);
                        list4 = (List) r11.get(numValueOf114);
                        if (list4 != null || list4.isEmpty()) {
                            r17 = r11;
                            aVar3.put(numValueOf114, zzghVar2);
                            r11 = r17;
                            it2 = it2;
                            str21 = str21;
                        } else {
                            ?? r18 = r11;
                            List listZzq = this.zzf.zzu().zzq(zzghVar2.zzk(), list4);
                            if (listZzq.isEmpty()) {
                                r11 = r18;
                            } else {
                                com.google.android.gms.internal.measurement.zzgg zzggVar = (com.google.android.gms.internal.measurement.zzgg) zzghVar2.zzby();
                                zzggVar.zzf();
                                zzggVar.zzb(listZzq);
                                List listZzq2 = this.zzf.zzu().zzq(zzghVar2.zzn(), list4);
                                zzggVar.zzh();
                                zzggVar.zzd(listZzq2);
                                zzob.zzc();
                                if (this.zzs.zzf().zzs(null, zzeb.zzaA)) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it10 = zzghVar2.zzj().iterator();
                                    while (it10.hasNext()) {
                                        com.google.android.gms.internal.measurement.zzfq zzfqVar2 = (com.google.android.gms.internal.measurement.zzfq) it10.next();
                                        Iterator it11 = it10;
                                        if (!list4.contains(Integer.valueOf(zzfqVar2.zza()))) {
                                            arrayList6.add(zzfqVar2);
                                        }
                                        it10 = it11;
                                    }
                                    zzggVar.zze();
                                    zzggVar.zza(arrayList6);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (com.google.android.gms.internal.measurement.zzgj zzgjVar2 : zzghVar2.zzm()) {
                                        if (!list4.contains(Integer.valueOf(zzgjVar2.zzb()))) {
                                            arrayList7.add(zzgjVar2);
                                        }
                                    }
                                    zzggVar.zzg();
                                    zzggVar.zzc(arrayList7);
                                } else {
                                    for (int i14 = 0; i14 < zzghVar2.zza(); i14++) {
                                        if (list4.contains(Integer.valueOf(zzghVar2.zze(i14).zza()))) {
                                            zzggVar.zzi(i14);
                                        }
                                    }
                                    for (int i15 = 0; i15 < zzghVar2.zzc(); i15++) {
                                        if (list4.contains(Integer.valueOf(zzghVar2.zzi(i15).zzb()))) {
                                            zzggVar.zzj(i15);
                                        }
                                    }
                                }
                                aVar3.put(Integer.valueOf(iIntValue10), (com.google.android.gms.internal.measurement.zzgh) zzggVar.zzaE());
                                r17 = r18;
                                r11 = r17;
                                it2 = it2;
                                str21 = str21;
                            }
                        }
                    }
                }
                str3 = str21;
                map3 = aVar3;
            } else {
                str3 = "Database error querying filters. appId";
                map3 = map2;
            }
            it = hashSet3.iterator();
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                zzghVar = (com.google.android.gms.internal.measurement.zzgh) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new q.a();
                if (zzghVar != null && zzghVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzfqVar.zzh()) {
                            Integer numValueOf115 = Integer.valueOf(zzfqVar.zza());
                            if (zzfqVar.zzg()) {
                                lValueOf = Long.valueOf(zzfqVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf115, lValueOf);
                        }
                    }
                }
                q.a aVar13 = new q.a();
                if (zzghVar != null && zzghVar.zzc() != 0) {
                    while (r2.hasNext()) {
                        if (!zzgjVar.zzi() && zzgjVar.zza() > 0) {
                            aVar13.put(Integer.valueOf(zzgjVar.zzb()), Long.valueOf(zzgjVar.zzc(zzgjVar.zza() - 1)));
                            map3 = map3;
                        }
                    }
                }
                Map map10 = map3;
                if (zzghVar != null) {
                    i12 = 0;
                    while (i12 < zzghVar.zzd() * 64) {
                        if (zzlb.zzv(zzghVar.zzn(), i12)) {
                            str6 = str20;
                            this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (zzlb.zzv(zzghVar.zzk(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            str20 = str6;
                        } else {
                            str6 = str20;
                        }
                        aVar.remove(Integer.valueOf(i12));
                        i12++;
                        str20 = str6;
                    }
                }
                String str216 = str20;
                Integer numValueOf116 = Integer.valueOf(iIntValue);
                com.google.android.gms.internal.measurement.zzgh zzghVar6 = (com.google.android.gms.internal.measurement.zzgh) map2.get(numValueOf116);
                if (!zZzs2 && zZzs && (list3 = (List) map.get(numValueOf116)) != null && this.zze != null && this.zzd != null) {
                    for (com.google.android.gms.internal.measurement.zzej zzejVar6 : list3) {
                        int iZzb = zzejVar6.zzb();
                        long jLongValue = this.zze.longValue() / 1000;
                        if (zzejVar6.zzm()) {
                            jLongValue = this.zzd.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iZzb);
                        if (aVar.containsKey(numValueOf20)) {
                            aVar.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (aVar13.containsKey(numValueOf20)) {
                            aVar13.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.zzc.put(Integer.valueOf(iIntValue), new zzu(this, this.zza, zzghVar6, bitSet, bitSet2, aVar, aVar13, null));
                str20 = str216;
                map = map;
                map3 = map10;
                map2 = map2;
            }
            str4 = str20;
            str5 = str3;
        }
        if (!list.isEmpty()) {
            zzwVar = new zzw(this, null);
            aVar4 = new q.a();
            it3 = list.iterator();
            while (it3.hasNext()) {
                zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it3.next();
                zzfsVarZza = zzwVar.zza(this.zza, zzfsVar);
                if (zzfsVarZza != null) {
                    zzamVarZzi = this.zzf.zzi();
                    str8 = this.zza;
                    strZzh = zzfsVarZza.zzh();
                    zzasVarZzn = zzamVarZzi.zzn(str8, zzfsVar.zzh());
                    if (zzasVarZzn == null) {
                        zzamVarZzi.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.zzn(str8), zzamVarZzi.zzs.zzj().zzd(strZzh));
                        zzasVar = new zzas(str8, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                    } else {
                        zzasVar = new zzas(zzasVarZzn.zza, zzasVarZzn.zzb, zzasVarZzn.zzc + 1, zzasVarZzn.zzd + 1, zzasVarZzn.zze + 1, zzasVarZzn.zzf, zzasVarZzn.zzg, zzasVarZzn.zzh, zzasVarZzn.zzi, zzasVarZzn.zzj, zzasVarZzn.zzk);
                    }
                    this.zzf.zzi().zzE(zzasVar);
                    j10 = zzasVar.zzc;
                    strZzh2 = zzfsVarZza.zzh();
                    mapEmptyMap = (Map) aVar4.get(strZzh2);
                    if (mapEmptyMap == null) {
                        zzamVarZzi2 = this.zzf.zzi();
                        str9 = this.zza;
                        zzamVarZzi2.zzW();
                        zzamVarZzi2.zzg();
                        Preconditions.checkNotEmpty(str9);
                        Preconditions.checkNotEmpty(strZzh2);
                        aVar5 = new q.a();
                        str10 = str2;
                        str11 = str22;
                        str22 = str11;
                        cursorQuery2 = zzamVarZzi2.zzh().query("event_filters", new String[]{str10, str11}, "app_id=? AND event_name=?", new String[]{str9, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            str2 = str10;
                            while (true) {
                                com.google.android.gms.internal.measurement.zzej zzejVar7 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzlb.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) aVar5.get(numValueOf3);
                                if (list5 == null) {
                                    zzasVar2 = zzasVar;
                                    arrayList2 = new ArrayList();
                                    aVar5.put(numValueOf3, arrayList2);
                                } else {
                                    zzasVar2 = zzasVar;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(zzejVar7);
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                zzasVar = zzasVar2;
                            }
                            cursorQuery2.close();
                            mapEmptyMap = aVar5;
                        } else {
                            zzasVar2 = zzasVar;
                            str2 = str10;
                            mapEmptyMap = Collections.emptyMap();
                            cursorQuery2.close();
                        }
                        aVar4.put(strZzh2, mapEmptyMap);
                    } else {
                        zzasVar2 = zzasVar;
                    }
                    it4 = mapEmptyMap.keySet().iterator();
                    while (it4.hasNext()) {
                        iIntValue2 = ((Integer) it4.next()).intValue();
                        set = this.zzb;
                        numValueOf2 = Integer.valueOf(iIntValue2);
                        if (set.contains(numValueOf2)) {
                            this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                        } else {
                            zZzd = true;
                            while (r5.hasNext()) {
                                zzxVar = new zzx(this, this.zza, iIntValue2, zzejVar3);
                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzfsVarZza, j10, zzasVar2, zzf(iIntValue2, zzejVar3.zzb()));
                                if (!zZzd) {
                                    this.zzb.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                zzd(Integer.valueOf(iIntValue2)).zzc(zzxVar);
                            }
                            if (!zZzd) {
                                this.zzb.add(Integer.valueOf(iIntValue2));
                            }
                        }
                    }
                    zzwVar = zzwVar;
                    it3 = it3;
                    str18 = str18;
                }
            }
        }
        str12 = str18;
        if (!list2.isEmpty()) {
            aVar6 = new q.a();
            it5 = list2.iterator();
            while (it5.hasNext()) {
                com.google.android.gms.internal.measurement.zzgl zzglVar4 = (com.google.android.gms.internal.measurement.zzgl) it5.next();
                strZzf = zzglVar4.zzf();
                mapEmptyMap2 = (Map) aVar6.get(strZzf);
                if (mapEmptyMap2 == null) {
                    zzamVarZzi3 = this.zzf.zzi();
                    str15 = this.zza;
                    zzamVarZzi3.zzW();
                    zzamVarZzi3.zzg();
                    Preconditions.checkNotEmpty(str15);
                    Preconditions.checkNotEmpty(strZzf);
                    aVar7 = new q.a();
                    str13 = str2;
                    str14 = str22;
                    cursorQuery3 = zzamVarZzi3.zzh().query("property_filters", new String[]{str13, str14}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.zzes zzesVar5 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzlb.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) aVar7.get(numValueOf7);
                            if (list6 == null) {
                                arrayList3 = new ArrayList();
                                aVar7.put(numValueOf7, arrayList3);
                            } else {
                                arrayList3 = list6;
                            }
                            arrayList3.add(zzesVar5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it5 = it5;
                        }
                        cursorQuery3.close();
                        mapEmptyMap2 = aVar7;
                    } else {
                        it5 = it5;
                        mapEmptyMap2 = Collections.emptyMap();
                        cursorQuery3.close();
                    }
                    aVar6.put(strZzf, mapEmptyMap2);
                } else {
                    it5 = it5;
                    str13 = str2;
                    str14 = str22;
                }
                it6 = mapEmptyMap2.keySet().iterator();
                while (it6.hasNext()) {
                    iIntValue3 = ((Integer) it6.next()).intValue();
                    set2 = this.zzb;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (set2.contains(numValueOf4)) {
                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it7 = ((List) mapEmptyMap2.get(numValueOf4)).iterator();
                    zZzd2 = true;
                    while (true) {
                        if (it7.hasNext()) {
                            zzesVar = (com.google.android.gms.internal.measurement.zzes) it7.next();
                            if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                zzem zzemVarZzj4 = this.zzs.zzay().zzj();
                                Integer numValueOf117 = Integer.valueOf(iIntValue3);
                                if (zzesVar.zzj()) {
                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzemVarZzj4.zzd("Evaluating filter. audience, filter, property", numValueOf117, numValueOf6, this.zzs.zzj().zzf(zzesVar.zze()));
                                this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                            }
                            if (zzesVar.zzj() || zzesVar.zza() > 256) {
                                zzem zzemVarZzk4 = this.zzs.zzay().zzk();
                                Object objZzn4 = zzeo.zzn(this.zza);
                                if (zzesVar.zzj()) {
                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzemVarZzk4.zzc("Invalid property filter ID. appId, id", objZzn4, String.valueOf(numValueOf5));
                                this.zzb.add(Integer.valueOf(iIntValue3));
                                mapEmptyMap2 = mapEmptyMap2;
                            } else {
                                zzzVar = new zzz(this, this.zza, iIntValue3, zzesVar);
                                zZzd2 = zzzVar.zzd(this.zzd, this.zze, zzglVar4, zzf(iIntValue3, zzesVar.zza()));
                                if (zZzd2) {
                                    zzd(Integer.valueOf(iIntValue3)).zzc(zzzVar);
                                    mapEmptyMap2 = mapEmptyMap2;
                                } else {
                                    this.zzb.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        } else {
                            mapEmptyMap2 = mapEmptyMap2;
                        }
                        if (!zZzd2) {
                            this.zzb.add(Integer.valueOf(iIntValue3));
                        }
                        mapEmptyMap2 = mapEmptyMap2;
                    }
                }
                it5 = it5;
                str22 = str14;
                str2 = str13;
            }
        }
        str16 = str2;
        arrayList4 = new ArrayList();
        Set setKeySet4 = this.zzc.keySet();
        setKeySet4.removeAll(this.zzb);
        it8 = setKeySet4.iterator();
        while (it8.hasNext()) {
            int iIntValue11 = ((Integer) it8.next()).intValue();
            Map map11 = this.zzc;
            Integer numValueOf118 = Integer.valueOf(iIntValue11);
            zzu zzuVar4 = (zzu) map11.get(numValueOf118);
            Preconditions.checkNotNull(zzuVar4);
            com.google.android.gms.internal.measurement.zzfo zzfoVarZza4 = zzuVar4.zza(iIntValue11);
            arrayList4.add(zzfoVarZza4);
            zzamVarZzi4 = this.zzf.zzi();
            str17 = this.zza;
            com.google.android.gms.internal.measurement.zzgh zzghVarZzd4 = zzfoVarZza4.zzd();
            zzamVarZzi4.zzW();
            zzamVarZzi4.zzg();
            Preconditions.checkNotEmpty(str17);
            Preconditions.checkNotNull(zzghVarZzd4);
            byte[] bArrZzbv4 = zzghVarZzd4.zzbv();
            contentValues = new ContentValues();
            contentValues.put("app_id", str17);
            contentValues.put(str16, numValueOf118);
            String str217 = str12;
            contentValues.put(str217, bArrZzbv4);
            if (zzamVarZzi4.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                zzamVarZzi4.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.zzn(str17));
            }
            str12 = str217;
        }
        return arrayList4;
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        return false;
    }
}
