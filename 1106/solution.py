class Solution:
    def parseBoolExpr(self, expression: str) -> bool:
        if len(expression) == 1:
            return expression == "t"
        queue = []
        v = None
        for v in reversed(expression):
            if v == "|" or v == "&" or v == "!":
                value = None
                if v == "|":
                    value = False
                elif v == "&":
                    value = True
                print("Initial ",v,(''.join(queue))[::-1])
                while queue:
                    each = queue.pop()
                    print(v,''.join(queue)[::-1])
                    if v == "&" and each == "f":
                        value = False
                    if v == "|" and each == "t":
                        value = True
                    if v == "!" and each == "t":
                        value = False
                    if v == "!" and each == "f":
                        value = True
                    if each == ")":
                        break

                print(f"Agrego {'t' if value else 'f'}")
                queue.append("t" if value else "f")
            elif v != ",":
                queue.append(v)

        return queue[0] == "t"