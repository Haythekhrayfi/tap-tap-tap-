package com.applovin.exoplayer2.common.base;

import ch.qos.logback.core.CoreConstants;
import com.applovin.exoplayer2.b.h0;
import java.util.Arrays;
import java.util.BitSet;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public abstract class CharMatcher implements Predicate<Character> {

    public static final class a extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharMatcher f4962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharMatcher f4963b;

        public a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f4962a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f4963b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f4962a.matches(c10) && this.f4963b.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f4962a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f4963b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.and(");
            sbA.append(this.f4962a);
            sbA.append(", ");
            sbA.append(this.f4963b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class aa extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f4964a = Integer.numberOfLeadingZeros(31);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final aa f4965b = new aa();

        public aa() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f4964a) == c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (int i10 = 0; i10 < 32; i10++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i10));
            }
        }
    }

    public static final class b extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f4966a = new b();

        private b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.length() == 0 ? "" : String.valueOf(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i10, length);
            if (i10 == length) {
                return -1;
            }
            return i10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c10);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence2.length() * charSequence.length());
            for (int i10 = 0; i10 < charSequence.length(); i10++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }
    }

    public static final class c extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char[] f4967a;

        public c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f4967a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Arrays.binarySearch(this.f4967a, c10) >= 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            for (char c10 : this.f4967a) {
                bitSet.set(c10);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c10 : this.f4967a) {
                sb2.append(CharMatcher.showCharacter(c10));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    public static final class d extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4968a = new d();

        public d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 <= 127;
        }
    }

    public static final class e extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CharMatcher f4969a = new e();

        private e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            if (c10 != ' ' && c10 != 133 && c10 != 5760) {
                if (c10 == 8199) {
                    return false;
                }
                if (c10 != 8287 && c10 != 12288 && c10 != 8232 && c10 != 8233) {
                    switch (c10) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            return c10 >= 8192 && c10 <= 8202;
                    }
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    public static final class f extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f4970a = new f();

        private f() {
            super("CharMatcher.digit()", a(), b());
        }

        private static char[] a() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }

        private static char[] b() {
            char[] cArr = new char[37];
            for (int i10 = 0; i10 < 37; i10++) {
                cArr[i10] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i10) + '\t');
            }
            return cArr;
        }
    }

    public static abstract class g extends CharMatcher {
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new v(this);
        }
    }

    public static final class h extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Predicate<? super Character> f4971a;

        public h(Predicate<? super Character> predicate) {
            this.f4971a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch2) {
            return this.f4971a.apply(Preconditions.checkNotNull(ch2));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f4971a.apply(Character.valueOf(c10));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.forPredicate(");
            sbA.append(this.f4971a);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class i extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f4972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f4973b;

        public i(char c10, char c11) {
            Preconditions.checkArgument(c11 >= c10);
            this.f4972a = c10;
            this.f4973b = c11;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f4972a <= c10 && c10 <= this.f4973b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f4972a, this.f4973b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.inRange('");
            sbA.append(CharMatcher.showCharacter(this.f4972a));
            sbA.append("', '");
            sbA.append(CharMatcher.showCharacter(this.f4973b));
            sbA.append("')");
            return sbA.toString();
        }
    }

    public static final class j extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f4974a = new j();

        private j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    public static final class k extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f4975a;

        public k(char c10) {
            this.f4975a = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f4975a) ? this : CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 == this.f4975a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f4975a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f4975a) ? charMatcher : super.or(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString().replace(this.f4975a, c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f4975a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.is('");
            sbA.append(CharMatcher.showCharacter(this.f4975a));
            sbA.append("')");
            return sbA.toString();
        }
    }

    public static final class l extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f4976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char f4977b;

        public l(char c10, char c11) {
            this.f4976a = c10;
            this.f4977b = c11;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 == this.f4976a || c10 == this.f4977b;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(this.f4976a);
            bitSet.set(this.f4977b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.anyOf(\"");
            sbA.append(CharMatcher.showCharacter(this.f4976a));
            sbA.append(CharMatcher.showCharacter(this.f4977b));
            sbA.append("\")");
            return sbA.toString();
        }
    }

    public static final class m extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f4978a;

        public m(char c10) {
            this.f4978a = c10;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return charMatcher.matches(this.f4978a) ? super.and(charMatcher) : charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 != this.f4978a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.is(this.f4978a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return charMatcher.matches(this.f4978a) ? CharMatcher.any() : this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            bitSet.set(0, this.f4978a);
            bitSet.set(this.f4978a + 1, 65536);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.isNot('");
            sbA.append(CharMatcher.showCharacter(this.f4978a));
            sbA.append("')");
            return sbA.toString();
        }
    }

    public static final class n extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f4979a = new n();

        private n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isDigit(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    public static final class o extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f4980a = new o();

        private o() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return c10 <= 31 || (c10 >= 127 && c10 <= 159);
        }
    }

    public static final class p extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f4981a = new p();

        private p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetter(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    public static final class q extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f4982a = new q();

        private q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLetterOrDigit(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    public static final class r extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f4983a = new r();

        private r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isLowerCase(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    public static final class s extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f4984a = new s();

        private s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return Character.isUpperCase(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    public static abstract class t extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4985a;

        public t(String str) {
            this.f4985a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.f4985a;
        }
    }

    public static class u extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharMatcher f4986a;

        public u(CharMatcher charMatcher) {
            this.f4986a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f4986a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return !this.f4986a.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f4986a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f4986a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f4986a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f4986a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f4986a + ".negate()";
        }
    }

    public static class v extends u {
        public v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    public static final class w extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f4987a = new w();

        private w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i10) {
            Preconditions.checkPositionIndex(i10, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c10) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }
    }

    public static final class x extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharMatcher f4988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharMatcher f4989b;

        public x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f4988a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f4989b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            return this.f4988a.matches(c10) || this.f4989b.matches(c10);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public void setBits(BitSet bitSet) {
            this.f4988a.setBits(bitSet);
            this.f4989b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sbA = defpackage.a.a("CharMatcher.or(");
            sbA.append(this.f4988a);
            sbA.append(", ");
            sbA.append(this.f4989b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static class y extends CharMatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final char[] f4991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final char[] f4992c;

        public y(String str, char[] cArr, char[] cArr2) {
            this.f4990a = str;
            this.f4991b = cArr;
            this.f4992c = cArr2;
            Preconditions.checkArgument(cArr.length == cArr2.length);
            int i10 = 0;
            while (i10 < cArr.length) {
                Preconditions.checkArgument(cArr[i10] <= cArr2[i10]);
                int i11 = i10 + 1;
                if (i11 < cArr.length) {
                    Preconditions.checkArgument(cArr2[i10] < cArr[i11]);
                }
                i10 = i11;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.apply(ch2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c10) {
            int iBinarySearch = Arrays.binarySearch(this.f4991b, c10);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i10 = (~iBinarySearch) - 1;
            return i10 >= 0 && c10 <= this.f4992c[i10];
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f4990a;
        }
    }

    public static final class z extends y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f4993a = new z();

        private z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    public static CharMatcher any() {
        return b.f4966a;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return none();
        }
        if (length != 1) {
            return length != 2 ? new c(charSequence) : isEither(charSequence.charAt(0), charSequence.charAt(1));
        }
        return is(charSequence.charAt(0));
    }

    public static CharMatcher ascii() {
        return d.f4968a;
    }

    public static CharMatcher breakingWhitespace() {
        return e.f4969a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return f.f4970a;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (!matches(cCharAt)) {
                sb2.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        return predicate instanceof CharMatcher ? (CharMatcher) predicate : new h(predicate);
    }

    public static CharMatcher inRange(char c10, char c11) {
        return new i(c10, c11);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return j.f4974a;
    }

    public static CharMatcher is(char c10) {
        return new k(c10);
    }

    private static l isEither(char c10, char c11) {
        return new l(c10, c11);
    }

    public static CharMatcher isNot(char c10) {
        return new m(c10);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return n.f4979a;
    }

    public static CharMatcher javaIsoControl() {
        return o.f4980a;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return p.f4981a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return q.f4982a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return r.f4983a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return s.f4984a;
    }

    public static CharMatcher none() {
        return w.f4987a;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c10) {
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return z.f4993a;
    }

    public static CharMatcher whitespace() {
        return aa.f4965b;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new a(this, charMatcher);
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (matches(cCharAt)) {
                if (cCharAt != c10 || (i10 != length - 1 && matches(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return finishCollapseFrom(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c10);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public CharMatcher negate() {
        return new u(this);
    }

    public CharMatcher or(CharMatcher charMatcher) {
        return new x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    i10++;
                } else {
                    charArray[iIndexIn - i10] = charArray[iIndexIn];
                    iIndexIn++;
                }
            }
            return new String(charArray, 0, iIndexIn - i10);
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c10;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c10;
            }
        }
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(h0.a(length2, 3, 2, 16));
        do {
            sb2.append((CharSequence) string, i10, iIndexIn);
            sb2.append(charSequence2);
            i10 = iIndexIn + 1;
            iIndexIn = indexIn(string, i10);
        } while (iIndexIn != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public void setBits(BitSet bitSet) {
        for (int i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return finishCollapseFrom(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }
}
