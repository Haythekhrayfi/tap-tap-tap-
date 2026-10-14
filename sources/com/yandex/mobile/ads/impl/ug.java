package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ch.qos.logback.core.joran.action.Action;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, tg> f25608a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f25609b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f25610c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f25611d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f25612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f25613f;

    public static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String[] f25614e = {FacebookMediationAdapter.KEY_ID, Action.KEY_ATTRIBUTE, "metadata"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final rm f25615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<tg> f25616b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f25618d;

        public a(ms msVar) {
            this.f25615a = msVar;
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(long j10) {
            String hexString = Long.toHexString(j10);
            this.f25617c = hexString;
            this.f25618d = fn1.a("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(tg tgVar) {
            this.f25616b.put(tgVar.f25359a, tgVar);
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(tg tgVar, boolean z10) {
            if (z10) {
                this.f25616b.delete(tgVar.f25359a);
            } else {
                this.f25616b.put(tgVar.f25359a, null);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(HashMap<String, tg> map) throws Throwable {
            if (this.f25616b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f25615a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f25616b.size(); i10++) {
                    try {
                        tg tgVarValueAt = this.f25616b.valueAt(i10);
                        if (tgVarValueAt == null) {
                            int iKeyAt = this.f25616b.keyAt(i10);
                            String str = this.f25618d;
                            Objects.requireNonNull(str);
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            sn snVarA = tgVarValueAt.a();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            Set<Map.Entry<String, byte[]>> setA = snVarA.a();
                            dataOutputStream.writeInt(setA.size());
                            for (Map.Entry<String, byte[]> entry : setA) {
                                dataOutputStream.writeUTF(entry.getKey());
                                byte[] value = entry.getValue();
                                dataOutputStream.writeInt(value.length);
                                dataOutputStream.write(value);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(tgVarValueAt.f25359a));
                            contentValues.put(Action.KEY_ATTRIBUTE, tgVarValueAt.f25360b);
                            contentValues.put("metadata", byteArray);
                            String str2 = this.f25618d;
                            Objects.requireNonNull(str2);
                            writableDatabase.replaceOrThrow(str2, null, contentValues);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f25616b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new qm(e10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(HashMap<String, tg> map, SparseArray<String> sparseArray) throws Throwable {
            pa.b(this.f25616b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = this.f25615a.getReadableDatabase();
                String str = this.f25617c;
                Objects.requireNonNull(str);
                if (xb1.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.f25615a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str2 = this.f25617c;
                        Objects.requireNonNull(str2);
                        xb1.a(writableDatabase, 1, str2, 1);
                        String str3 = this.f25618d;
                        Objects.requireNonNull(str3);
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + str3);
                        writableDatabase.execSQL("CREATE TABLE " + this.f25618d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.f25615a.getReadableDatabase();
                String str4 = this.f25618d;
                Objects.requireNonNull(str4);
                Cursor cursorQuery = readableDatabase2.query(str4, f25614e, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i10 = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        Objects.requireNonNull(string);
                        map.put(string, new tg(i10, string, ug.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i10, string);
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new qm(e10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final boolean a() throws Throwable {
            SQLiteDatabase readableDatabase = this.f25615a.getReadableDatabase();
            String str = this.f25617c;
            Objects.requireNonNull(str);
            return xb1.a(readableDatabase, 1, str) != -1;
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void b() throws Throwable {
            rm rmVar = this.f25615a;
            String str = this.f25617c;
            Objects.requireNonNull(str);
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                SQLiteDatabase writableDatabase = rmVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    xb1.a(writableDatabase, str);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new qm(e10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void b(HashMap<String, tg> map) throws Throwable {
            try {
                SQLiteDatabase writableDatabase = this.f25615a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    String str = this.f25617c;
                    Objects.requireNonNull(str);
                    xb1.a(writableDatabase, 1, str, 1);
                    String str2 = this.f25618d;
                    Objects.requireNonNull(str2);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.execSQL("CREATE TABLE " + this.f25618d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    for (tg tgVar : map.values()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        sn snVarA = tgVar.a();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry<String, byte[]>> setA = snVarA.a();
                        dataOutputStream.writeInt(setA.size());
                        for (Map.Entry<String, byte[]> entry : setA) {
                            dataOutputStream.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream.writeInt(value.length);
                            dataOutputStream.write(value);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(FacebookMediationAdapter.KEY_ID, Integer.valueOf(tgVar.f25359a));
                        contentValues.put(Action.KEY_ATTRIBUTE, tgVar.f25360b);
                        contentValues.put("metadata", byteArray);
                        String str3 = this.f25618d;
                        Objects.requireNonNull(str3);
                        writableDatabase.replaceOrThrow(str3, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f25616b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new qm(e10);
            }
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25619a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f25620b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f25621c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SecureRandom f25622d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final tb f25623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private tx0 f25625g;

        public b(File file) {
            this.f25623e = new tb(file);
        }

        private static tg a(int i10, DataInputStream dataInputStream) throws IOException {
            sn snVarA;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                yk ykVar = new yk();
                yk.a(ykVar, j10);
                snVarA = sn.f25141c.a(ykVar);
            } else {
                snVarA = ug.a(dataInputStream);
            }
            return new tg(i11, utf, snVarA);
        }

        private boolean b(HashMap<String, tg> map, SparseArray<String> sparseArray) throws Throwable {
            int iHashCode;
            if (!this.f25623e.b()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f25623e.c());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f25620b == null) {
                                da1.a((Closeable) dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                Cipher cipher = this.f25620b;
                                SecretKeySpec secretKeySpec = this.f25621c;
                                int i11 = da1.f19803a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f25620b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f25619a) {
                            this.f25624f = true;
                        }
                        int i12 = dataInputStream2.readInt();
                        int i13 = 0;
                        for (int i14 = 0; i14 < i12; i14++) {
                            tg tgVarA = a(i10, dataInputStream2);
                            map.put(tgVarA.f25360b, tgVarA);
                            sparseArray.put(tgVarA.f25359a, tgVarA.f25360b);
                            int iHashCode2 = tgVarA.f25360b.hashCode() + (tgVarA.f25359a * 31);
                            if (i10 < 2) {
                                long jB = tgVarA.a().b();
                                iHashCode = (iHashCode2 * 31) + ((int) (jB ^ (jB >>> 32)));
                            } else {
                                iHashCode = (iHashCode2 * 31) + tgVarA.a().hashCode();
                            }
                            i13 += iHashCode;
                        }
                        int i15 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i15 == i13 && z10) {
                            da1.a((Closeable) dataInputStream2);
                            return true;
                        }
                        da1.a((Closeable) dataInputStream2);
                        return false;
                    }
                    da1.a((Closeable) dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        da1.a((Closeable) dataInputStream);
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        da1.a((Closeable) dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(long j10) {
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(tg tgVar) {
            this.f25624f = true;
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(tg tgVar, boolean z10) {
            this.f25624f = true;
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(HashMap<String, tg> map) throws Throwable {
            if (this.f25624f) {
                b(map);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void a(HashMap<String, tg> map, SparseArray<String> sparseArray) {
            pa.b(!this.f25624f);
            if (b(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f25623e.a();
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final boolean a() {
            return this.f25623e.b();
        }

        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void b() {
            this.f25623e.a();
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
        @Override // com.yandex.mobile.ads.impl.ug.c
        public final void b(HashMap<String, tg> map) throws Throwable {
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamD = this.f25623e.d();
                tx0 tx0Var = this.f25625g;
                if (tx0Var == null) {
                    this.f25625g = new tx0(outputStreamD);
                } else {
                    tx0Var.a(outputStreamD);
                }
                tx0 tx0Var2 = this.f25625g;
                dataOutputStream = new DataOutputStream(tx0Var2);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(this.f25619a ? 1 : 0);
                    if (this.f25619a) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f25622d;
                        int i10 = da1.f19803a;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f25620b.init(1, this.f25621c, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(tx0Var2, this.f25620b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(map.size());
                    int iHashCode = 0;
                    for (tg tgVar : map.values()) {
                        dataOutputStream2.writeInt(tgVar.f25359a);
                        dataOutputStream2.writeUTF(tgVar.f25360b);
                        Set<Map.Entry<String, byte[]>> setA = tgVar.a().a();
                        dataOutputStream2.writeInt(setA.size());
                        for (Map.Entry<String, byte[]> entry : setA) {
                            dataOutputStream2.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream2.writeInt(value.length);
                            dataOutputStream2.write(value);
                        }
                        iHashCode += tgVar.a().hashCode() + ((tgVar.f25360b.hashCode() + (tgVar.f25359a * 31)) * 31);
                    }
                    dataOutputStream2.writeInt(iHashCode);
                    this.f25623e.a(dataOutputStream2);
                    int i11 = da1.f19803a;
                    this.f25624f = false;
                } catch (Throwable th) {
                    th = th;
                    da1.a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
            }
        }
    }

    public interface c {
        void a(long j10);

        void a(tg tgVar);

        void a(tg tgVar, boolean z10);

        void a(HashMap<String, tg> map) throws Throwable;

        void a(HashMap<String, tg> map, SparseArray<String> sparseArray) throws Throwable;

        boolean a() throws Throwable;

        void b() throws Throwable;

        void b(HashMap<String, tg> map) throws Throwable;
    }

    public ug(ms msVar, File file) {
        a aVar = new a(msVar);
        b bVar = new b(new File(file, "yandex_cached_content_index.exi"));
        this.f25612e = aVar;
        this.f25613f = bVar;
    }

    public static sn a(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException(u60.a("Invalid value size: ", i12));
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = da1.f19808f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new sn(map);
    }

    public final tg a(String str) {
        return this.f25608a.get(str);
    }

    public final String a(int i10) {
        return this.f25609b.get(i10);
    }

    public final Collection<tg> a() {
        return Collections.unmodifiableCollection(this.f25608a.values());
    }

    public final void a(long j10) throws Throwable {
        c cVar;
        this.f25612e.a(j10);
        c cVar2 = this.f25613f;
        if (cVar2 != null) {
            cVar2.a(j10);
        }
        if (this.f25612e.a() || (cVar = this.f25613f) == null || !cVar.a()) {
            this.f25612e.a(this.f25608a, this.f25609b);
        } else {
            this.f25613f.a(this.f25608a, this.f25609b);
            this.f25612e.b(this.f25608a);
        }
        c cVar3 = this.f25613f;
        if (cVar3 != null) {
            cVar3.b();
            this.f25613f = null;
        }
    }

    public final void a(String str, yk ykVar) {
        tg tgVarB = b(str);
        if (tgVarB.a(ykVar)) {
            this.f25612e.a(tgVarB);
        }
    }

    public final tg b(String str) {
        tg tgVar = this.f25608a.get(str);
        if (tgVar != null) {
            return tgVar;
        }
        SparseArray<String> sparseArray = this.f25609b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        tg tgVar2 = new tg(iKeyAt, str, sn.f25141c);
        this.f25608a.put(str, tgVar2);
        this.f25609b.put(iKeyAt, str);
        this.f25611d.put(iKeyAt, true);
        this.f25612e.a(tgVar2);
        return tgVar2;
    }

    public final void b() {
        Iterator it = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f25608a.keySet()).iterator();
        while (it.hasNext()) {
            c((String) it.next());
        }
    }

    public final void c() throws Throwable {
        this.f25612e.a(this.f25608a);
        int size = this.f25610c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f25609b.remove(this.f25610c.keyAt(i10));
        }
        this.f25610c.clear();
        this.f25611d.clear();
    }

    public final void c(String str) {
        tg tgVar = this.f25608a.get(str);
        if (tgVar != null && tgVar.c() && tgVar.d()) {
            this.f25608a.remove(str);
            int i10 = tgVar.f25359a;
            boolean z10 = this.f25611d.get(i10);
            this.f25612e.a(tgVar, z10);
            SparseArray<String> sparseArray = this.f25609b;
            if (z10) {
                sparseArray.remove(i10);
                this.f25611d.delete(i10);
            } else {
                sparseArray.put(i10, null);
                this.f25610c.put(i10, true);
            }
        }
    }
}
