package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f1774j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile e f1775k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f1776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<AbstractC0033e> f1777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f1779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f1780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f1781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f1784i;

    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.i f1785b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile n f1786c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        public class C0032a extends h {
            public C0032a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.f1788a.f(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(n nVar) {
                a aVar = a.this;
                if (nVar == null) {
                    aVar.f1788a.f(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                aVar.f1786c = nVar;
                n nVar2 = aVar.f1786c;
                i iVar = new i();
                e eVar = aVar.f1788a;
                d dVar = eVar.f1784i;
                Objects.requireNonNull(eVar);
                aVar.f1785b = new androidx.emoji2.text.i(nVar2, iVar, dVar, false, null);
                aVar.f1788a.g();
            }
        }

        public a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        public void a() {
            try {
                this.f1788a.f1781f.a(new C0032a());
            } catch (Throwable th) {
                this.f1788a.f(th);
            }
        }

        /* JADX WARN: Code duplicated, block: B:88:0x015e A[DONT_GENERATE] */
        @Override // androidx.emoji2.text.e.b
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            q qVar;
            int i13;
            j[] jVarArr;
            int iCharCount = i10;
            int iMax = i11;
            int length = i12;
            androidx.emoji2.text.i iVar = this.f1785b;
            Objects.requireNonNull(iVar);
            boolean z11 = charSequence instanceof o;
            if (z11) {
                ((o) charSequence).a();
            }
            if (!z11) {
                try {
                    qVar = charSequence instanceof Spannable ? new q((Spannable) charSequence) : (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(iCharCount + (-1), iMax + 1, j.class) > iMax) ? null : new q(charSequence);
                } finally {
                    if (z11) {
                        ((o) charSequence).b();
                    }
                }
            }
            if (qVar != null && (jVarArr = (j[]) qVar.f1842d.getSpans(iCharCount, iMax, j.class)) != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = qVar.getSpanStart(jVar);
                    int spanEnd = qVar.getSpanEnd(jVar);
                    if (spanStart != iMax) {
                        qVar.removeSpan(jVar);
                    }
                    iCharCount = Math.min(spanStart, iCharCount);
                    iMax = Math.max(spanEnd, iMax);
                }
            }
            if (iCharCount != iMax && iCharCount < charSequence.length()) {
                if (length != Integer.MAX_VALUE && qVar != null) {
                    length -= ((j[]) qVar.getSpans(0, qVar.length(), j.class)).length;
                }
                androidx.emoji2.text.i.a aVar = new androidx.emoji2.text.i.a(iVar.f1806b.f1833c, false, null);
                int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                int i14 = 0;
                loop1: while (true) {
                    int iCodePointAt2 = iCodePointAt;
                    i13 = iCharCount;
                    while (true) {
                        if (iCharCount >= iMax || i14 >= length) {
                            break loop1;
                        }
                        int iA = aVar.a(iCodePointAt2);
                        if (iA == 1) {
                            iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                            if (iCharCount < iMax) {
                                iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                            }
                            i13 = iCharCount;
                        } else if (iA == 2) {
                            iCharCount += Character.charCount(iCodePointAt2);
                            if (iCharCount < iMax) {
                                iCodePointAt2 = Character.codePointAt(charSequence, iCharCount);
                            }
                        } else if (iA == 3) {
                            if (z10 || !iVar.b(charSequence, i13, iCharCount, aVar.f1811d.f1836b)) {
                                if (qVar == null) {
                                    qVar = new q((Spannable) new SpannableString(charSequence));
                                }
                                androidx.emoji2.text.h hVar = aVar.f1811d.f1836b;
                                Objects.requireNonNull(iVar.f1805a);
                                p pVar = new p(hVar);
                                qVar.a();
                                qVar.f1842d.setSpan(pVar, i13, iCharCount, 33);
                                i14++;
                            }
                            iCodePointAt = iCodePointAt2;
                        }
                    }
                }
                if ((aVar.f1808a == 2 && aVar.f1810c.f1836b != null && (aVar.f1813f > 1 || aVar.c())) && i14 < length && (z10 || !iVar.b(charSequence, i13, iCharCount, aVar.f1810c.f1836b))) {
                    if (qVar == null) {
                        qVar = new q(charSequence);
                    }
                    androidx.emoji2.text.h hVar2 = aVar.f1810c.f1836b;
                    Objects.requireNonNull(iVar.f1805a);
                    p pVar2 = new p(hVar2);
                    qVar.a();
                    qVar.f1842d.setSpan(pVar2, i13, iCharCount, 33);
                }
                if (qVar != null) {
                    Spannable spannable = qVar.f1842d;
                }
            }
            return charSequence;
        }

        @Override // androidx.emoji2.text.e.b
        public void c(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            y0.b bVar = this.f1786c.f1831a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? bVar.f37969b.getInt(iA + bVar.f37968a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.f1788a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f1788a;

        public b(e eVar) {
            this.f1788a = eVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f1789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1790b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f1791c = new androidx.emoji2.text.d();

        public c(g gVar) {
            this.f1789a = gVar;
        }
    }

    public interface d {
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0033e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class f implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<AbstractC0033e> f1792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Throwable f1793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f1794e;

        public f(Collection<AbstractC0033e> collection, int i10, Throwable th) {
            androidx.activity.i.f(collection, "initCallbacks cannot be null");
            this.f1792c = new ArrayList(collection);
            this.f1794e = i10;
            this.f1793d = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1792c.size();
            int i10 = 0;
            if (this.f1794e != 1) {
                while (i10 < size) {
                    this.f1792c.get(i10).a(this.f1793d);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f1792c.get(i10).b();
                    i10++;
                }
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    public static class i {
    }

    public e(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1776a = reentrantReadWriteLock;
        this.f1778c = 3;
        Objects.requireNonNull(cVar);
        this.f1782g = -16711936;
        this.f1781f = cVar.f1789a;
        int i10 = cVar.f1790b;
        this.f1783h = i10;
        this.f1784i = cVar.f1791c;
        this.f1779d = new Handler(Looper.getMainLooper());
        this.f1777b = new q.c();
        a aVar = new a(this);
        this.f1780e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1778c = 0;
            } catch (Throwable th) {
                this.f1776a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static e a() {
        e eVar;
        synchronized (f1774j) {
            eVar = f1775k;
            androidx.activity.i.h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean c() {
        return f1775k != null;
    }

    public int b() {
        this.f1776a.readLock().lock();
        try {
            return this.f1778c;
        } finally {
            this.f1776a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public void e() {
        androidx.activity.i.h(this.f1783h == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (d()) {
            return;
        }
        this.f1776a.writeLock().lock();
        try {
            if (this.f1778c == 0) {
                this.f1776a.writeLock().unlock();
                return;
            }
            this.f1778c = 0;
            this.f1776a.writeLock().unlock();
            this.f1780e.a();
        } catch (Throwable th) {
            this.f1776a.writeLock().unlock();
            throw th;
        }
    }

    public void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1776a.writeLock().lock();
        try {
            this.f1778c = 2;
            arrayList.addAll(this.f1777b);
            this.f1777b.clear();
            this.f1776a.writeLock().unlock();
            this.f1779d.post(new f(arrayList, this.f1778c, th));
        } catch (Throwable th2) {
            this.f1776a.writeLock().unlock();
            throw th2;
        }
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        this.f1776a.writeLock().lock();
        try {
            this.f1778c = 1;
            arrayList.addAll(this.f1777b);
            this.f1777b.clear();
            this.f1776a.writeLock().unlock();
            this.f1779d.post(new f(arrayList, this.f1778c, null));
        } catch (Throwable th) {
            this.f1776a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    public CharSequence i(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        androidx.activity.i.h(d(), "Not initialized yet");
        androidx.activity.i.e(i10, "start cannot be negative");
        androidx.activity.i.e(i11, "end cannot be negative");
        androidx.activity.i.e(i12, "maxEmojiCount cannot be negative");
        androidx.activity.i.c(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.activity.i.c(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.activity.i.c(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        return this.f1780e.b(charSequence, i10, i11, i12, i13 == 1);
    }

    public void j(AbstractC0033e abstractC0033e) {
        androidx.activity.i.f(abstractC0033e, "initCallback cannot be null");
        this.f1776a.writeLock().lock();
        try {
            if (this.f1778c == 1 || this.f1778c == 2) {
                Handler handler = this.f1779d;
                int i10 = this.f1778c;
                androidx.activity.i.f(abstractC0033e, "initCallback cannot be null");
                handler.post(new f(Arrays.asList(abstractC0033e), i10, null));
            } else {
                this.f1777b.add(abstractC0033e);
            }
        } finally {
            this.f1776a.writeLock().unlock();
        }
    }
}
