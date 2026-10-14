package ch.qos.logback.core.filter;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.FilterReply;
import defpackage.a;

/* JADX INFO: loaded from: classes.dex */
public class EvaluatorFilter<E> extends AbstractMatcherFilter<E> {
    public EventEvaluator<E> evaluator;

    @Override // ch.qos.logback.core.filter.Filter
    public FilterReply decide(E e10) {
        if (!isStarted() || !this.evaluator.isStarted()) {
            return FilterReply.NEUTRAL;
        }
        try {
            return this.evaluator.evaluate(e10) ? this.onMatch : this.onMismatch;
        } catch (EvaluationException e11) {
            StringBuilder sbA = a.a("Evaluator ");
            sbA.append(this.evaluator.getName());
            sbA.append(" threw an exception");
            addError(sbA.toString(), e11);
            return FilterReply.NEUTRAL;
        }
    }

    public EventEvaluator<E> getEvaluator() {
        return this.evaluator;
    }

    public void setEvaluator(EventEvaluator<E> eventEvaluator) {
        this.evaluator = eventEvaluator;
    }

    @Override // ch.qos.logback.core.filter.Filter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (this.evaluator != null) {
            super.start();
            return;
        }
        StringBuilder sbA = a.a("No evaluator set for filter ");
        sbA.append(getName());
        addError(sbA.toString());
    }
}
