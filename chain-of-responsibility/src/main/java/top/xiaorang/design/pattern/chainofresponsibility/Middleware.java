package top.xiaorang.design.pattern.chainofresponsibility;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">基础验证接口<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/17 5:39
 */
public abstract class Middleware {
    private Middleware next;

    /**
     * Subclasses will implement this method with concrete checks.
     */
    protected abstract boolean check(String email, String password);

    /**
     * Runs check on the next object in chain or ends traversing if we're in
     * last object in chain.
     */
    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }

    public static class Builder {
        private Middleware head;
        private Middleware tail;

        public Builder addMiddleware(Middleware middleware) {
            if (this.head == null) {
                this.head = this.tail = middleware;
                return this;
            }
            this.tail.next = middleware;
            this.tail = middleware;
            return this;
        }

        public Middleware build() {
            return this.head;
        }
    }
}
