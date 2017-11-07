public class Main {
}

    public static boolean hasDeadlock(int[][] connections) {
        Stack<Integer> visited = new Stack<>();
        Stack<Integer> inProcess = new Stack<>();
        int i=0;
        inProcess.push(i);

        while (inProcess.size()!=0){
            i = inProcess.peek();

            int[] children = connections[i];
            if (children.length!=0){
                boolean allChildVisited = false;
                for (int x=0;x<children.length;x++){
                    if (visited.contains(children[x])){
                        allChildVisited = true;
                        continue;
                    }
                    else{
                        allChildVisited = false;
                        if (inProcess.contains(children[x]))
                            return true;
                        else{
                            inProcess.push(children[x]);
                            break;
                        }
                    }
                }
                if (allChildVisited){
                    visited.push(i);
                    inProcess.pop();
                }
            }
            else if (children.length==0){
                visited.push(i);
                inProcess.pop();
            }

            if (inProcess.size()==0){
                for (int y=0; y<connections.length;y++) {
                    if (!visited.contains(y)){
                        inProcess.push(y);
                        break;
                    }
                }
            }

        }

        return false;
    }
}