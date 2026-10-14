package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final b strategy;
    private final CharMatcher trimmer;

    public static abstract class a extends com.applovin.exoplayer2.common.base.b<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f5034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CharMatcher f5035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f5036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5037e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5038f;

        public a(Splitter splitter, CharSequence charSequence) {
            this.f5035c = splitter.trimmer;
            this.f5036d = splitter.omitEmptyStrings;
            this.f5038f = splitter.limit;
            this.f5034b = charSequence;
        }

        public abstract int a(int i10);

        public abstract int b(int i10);

        @Override // com.applovin.exoplayer2.common.base.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i10;
            int iA;
            do {
                i10 = this.f5037e;
                while (true) {
                    int i11 = this.f5037e;
                    if (i11 == -1) {
                        return b();
                    }
                    iA = a(i11);
                    if (iA == -1) {
                        iA = this.f5034b.length();
                        this.f5037e = -1;
                    } else {
                        this.f5037e = b(iA);
                    }
                    int i12 = this.f5037e;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.f5037e = i13;
                        if (i13 > this.f5034b.length()) {
                            this.f5037e = -1;
                        }
                    }
                }
                while (i10 < iA && this.f5035c.matches(this.f5034b.charAt(i10))) {
                    i10++;
                }
                while (iA > i10 && this.f5035c.matches(this.f5034b.charAt(iA - 1))) {
                    iA--;
                }
                if (!this.f5036d) {
                    break;
                }
            } while (i10 == iA);
            int i14 = this.f5038f;
            if (i14 == 1) {
                iA = this.f5034b.length();
                this.f5037e = -1;
                while (iA > i10 && this.f5035c.matches(this.f5034b.charAt(iA - 1))) {
                    iA--;
                }
            } else {
                this.f5038f = i14 - 1;
            }
            return this.f5034b.subSequence(i10, iA).toString();
        }
    }

    public interface b {
        Iterator<String> b(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(b bVar) {
        this(bVar, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(b bVar, boolean z10, CharMatcher charMatcher, int i10) {
        this.strategy = bVar;
        this.omitEmptyStrings = z10;
        this.trimmer = charMatcher;
        this.limit = i10;
    }

    public static Splitter fixedLength(final int i10) {
        Preconditions.checkArgument(i10 > 0, "The length may not be less than 1");
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.3
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.3.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int a(int i11) {
                        int i12 = i11 + i10;
                        if (i12 < ((a) this).f5034b.length()) {
                            return i12;
                        }
                        return -1;
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i11) {
                        return i11;
                    }
                };
            }
        });
    }

    public static Splitter on(char c10) {
        return on(CharMatcher.is(c10));
    }

    public static Splitter on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.1
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.1.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int a(int i10) {
                        return charMatcher.indexIn(((a) this).f5034b, i10);
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i10) {
                        return i10 + 1;
                    }
                };
            }
        });
    }

    public static Splitter on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        return str.length() == 1 ? on(str.charAt(0)) : new Splitter(new b() { // from class: com.applovin.exoplayer2.common.base.Splitter.2
            @Override // com.applovin.exoplayer2.common.base.Splitter.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a b(Splitter splitter, CharSequence charSequence) {
                return new a(splitter, charSequence) { // from class: com.applovin.exoplayer2.common.base.Splitter.2.1
                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int a(int i10) {
                        int length = str.length();
                        int length2 = ((a) this).f5034b.length() - length;
                        while (i10 <= length2) {
                            for (int i11 = 0; i11 < length; i11++) {
                                if (((a) this).f5034b.charAt(i11 + i10) != str.charAt(i11)) {
                                    i10++;
                                }
                            }
                            return i10;
                        }
                        return -1;
                    }

                    @Override // com.applovin.exoplayer2.common.base.Splitter.a
                    public int b(int i10) {
                        return str.length() + i10;
                    }
                };
            }
        });
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.b(this, charSequence);
    }

    public Splitter limit(int i10) {
        Preconditions.checkArgument(i10 > 0, "must be greater than zero: %s", i10);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i10);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> itSplittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }
}
