package g8;

import ch.qos.logback.core.CoreConstants;
import ed.q;
import ed.u;
import fd.j0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import jc.w;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<Exception, w> f30044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char f30045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<Character> f30046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NumberFormat f30047h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Locale locale, l<? super Exception, w> lVar) {
        super(new a.b("", kc.w.f32009c, false));
        j0.i(locale, "locale");
        j0.i(lVar, "onError");
        this.f30044e = lVar;
        this.f30045f = (char) 164;
        this.f30046g = kc.l.c(Character.valueOf(CoreConstants.DOT), Character.valueOf(CoreConstants.COMMA_CHAR));
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        j0.h(currencyInstance, "getCurrencyInstance(locale)");
        o(currencyInstance);
        this.f30047h = currencyInstance;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    @Override // g8.a
    public void a(String str, Integer num) throws ParseException {
        int i10;
        int i11;
        j0.i(str, "newValue");
        d dVarA = d.f30049d.a(i(), q.p(str, ' ', (char) 160, false, 4));
        char decimalSeparator = p().getDecimalSeparator();
        String strI = i();
        int i12 = -1;
        int length = strI.length() - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i13 = length - 1;
            if (strI.charAt(length) == decimalSeparator) {
                break;
            }
            if (i13 < 0) {
                length = -1;
                break;
            }
            length = i13;
        }
        int length2 = str.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i14 = length2 - 1;
            if (str.charAt(length2) == decimalSeparator) {
                break;
            }
            if (i14 < 0) {
                length2 = -1;
                break;
            }
            length2 = i14;
        }
        boolean z10 = length != length2 || (length == -1 && length2 == -1);
        char decimalSeparator2 = p().getDecimalSeparator();
        int i15 = 0;
        while (true) {
            if (i15 >= str.length()) {
                i15 = -1;
                break;
            } else if (str.charAt(i15) == decimalSeparator2 && !q(dVarA, i15)) {
                break;
            } else {
                i15++;
            }
        }
        if (dVarA.f30051b != 1 || dVarA.f30052c != 0) {
            i10 = -1;
        } else if (this.f30046g.contains(Character.valueOf(str.charAt(dVarA.f30050a)))) {
            i10 = dVarA.f30050a;
        } else {
            i10 = -1;
        }
        int maximumFractionDigits = this.f30047h.getMaximumFractionDigits();
        if (i15 != -1) {
            i11 = maximumFractionDigits;
            for (int i16 = i15; i16 < str.length(); i16++) {
                if (Character.isDigit(str.charAt(i16)) && !q(dVarA, i16)) {
                    i11--;
                }
            }
        } else {
            int i17 = 0;
            int i18 = 0;
            boolean z11 = false;
            i11 = maximumFractionDigits;
            while (i17 < str.length()) {
                char cCharAt = str.charAt(i17);
                i17++;
                int i19 = i18 + 1;
                boolean zQ = q(dVarA, i18);
                if (cCharAt == decimalSeparator2) {
                    z11 = true;
                } else if (!zQ && z11 && Character.isDigit(cCharAt)) {
                    i11--;
                }
                i18 = i19;
            }
        }
        boolean z12 = u.w(str, decimalSeparator2, false, 2) || i10 != -1;
        StringBuilder sb2 = new StringBuilder();
        boolean z13 = false;
        for (int length3 = str.length() - 1; length3 >= 0; length3--) {
            char cCharAt2 = str.charAt(length3);
            boolean z14 = sb2.length() <= maximumFractionDigits;
            if (!Character.isDigit(cCharAt2)) {
                if (z14 && i15 == -1 && length3 == i10) {
                    sb2.append(decimalSeparator2);
                } else if (z14 && cCharAt2 == decimalSeparator2 && (i15 == length3 || i15 == -1)) {
                    sb2.append(decimalSeparator2);
                    i15 = length3;
                }
                z13 = true;
            } else if (!q(dVarA, length3) || z13 || !z12) {
                sb2.append(cCharAt2);
            } else if (i11 > 0) {
                sb2.append(cCharAt2);
                i11--;
            }
        }
        String string = sb2.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        j0.i(string, "<this>");
        StringBuilder sbReverse = new StringBuilder((CharSequence) string).reverse();
        j0.h(sbReverse, "StringBuilder(this).reverse()");
        String string2 = sbReverse.toString();
        int length4 = string2.length();
        int i20 = 0;
        while (i20 < length4) {
            int i21 = i20 + 1;
            if (string2.charAt(i20) != p().getZeroDigit()) {
                i12 = i20;
                break;
            }
            i20 = i21;
        }
        if (i12 > 0) {
            if (string2.charAt(i12) == p().getDecimalSeparator()) {
                i12--;
            }
            string2 = ed.w.Z(string2, i12);
        }
        NumberFormat numberFormat = this.f30047h;
        j0.i(string2, "<this>");
        Number number = numberFormat.parse(string2.length() > 0 && ed.b.c(string2.charAt(0), decimalSeparator, false) ? p().getZeroDigit() + string2 : q.k(string2) ? String.valueOf(p().getZeroDigit()) : string2);
        if (number == null) {
            number = 0;
        }
        c(dVarA);
        if (z10) {
            r(number);
        }
        l(string2, 0, null);
        int iAbs = (i().length() <= dVarA.f30050a || i().charAt(dVarA.f30050a) != p().getGroupingSeparator()) ? Math.abs(i().length() - (str.length() - (num == null ? this.f30031d : num.intValue()))) : num == null ? this.f30031d : num.intValue();
        int length5 = i().length();
        if (iAbs > length5) {
            iAbs = length5;
        }
        this.f30031d = iAbs;
    }

    @Override // g8.a
    public void j(Exception exc) {
        this.f30044e.invoke(exc);
    }

    @Override // g8.a
    public void k(String str) throws ParseException {
        Number number = this.f30047h.parse(str);
        if (number == null) {
            number = 0;
        }
        r(number);
        super.k(str);
    }

    public final NumberFormat o(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            j0.h(pattern, "toPattern()");
            StringBuilder sb2 = new StringBuilder();
            int length = pattern.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = pattern.charAt(i10);
                if (cCharAt != this.f30045f) {
                    sb2.append(cCharAt);
                }
                i10 = i11;
            }
            String string = sb2.toString();
            j0.h(string, "filterTo(StringBuilder(), predicate).toString()");
            decimalFormat.applyPattern(u.Y(string).toString());
        }
        return numberFormat;
    }

    public final DecimalFormatSymbols p() {
        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) this.f30047h).getDecimalFormatSymbols();
        j0.h(decimalFormatSymbols, "currencyFormatter as Dec…mat).decimalFormatSymbols");
        return decimalFormatSymbols;
    }

    public final boolean q(d dVar, int i10) {
        int i11 = dVar.f30050a;
        return i11 <= i10 && i10 < i11 + dVar.f30051b;
    }

    public final void r(Number number) {
        String str = this.f30047h.format(number);
        j0.h(str, "formatted");
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            char c10 = '#';
            if (i10 >= str.length()) {
                String string = sb2.toString();
                j0.h(string, "StringBuilder().apply(builderAction).toString()");
                char decimalSeparator = p().getDecimalSeparator();
                StringBuilder sbA = o2.b.a('[');
                sbA.append(p().getDecimalSeparator());
                sbA.append(']');
                n(new a.b(string, kc.l.c(new a.c('#', "\\d", '0'), new a.c(decimalSeparator, sbA.toString(), p().getDecimalSeparator())), this.f30028a.f30038c), false);
                return;
            }
            char cCharAt = str.charAt(i10);
            i10++;
            if (!Character.isDigit(cCharAt)) {
                c10 = cCharAt;
            }
            sb2.append(c10);
        }
    }
}
