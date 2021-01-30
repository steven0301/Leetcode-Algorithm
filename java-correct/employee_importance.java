import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        // 중요 : 대푯값(id), 전체정보(Employee) 형태로 Map에 저장한다.
        Map<Integer, Employee> map = new HashMap<>();
        for(int i=0; i<employees.size() ;i++){
            map.put(employees.get(i).id, employees.get(i));
        }
                    
        return dfs(id, map);
    }
                    
    public int dfs(int id, Map<Integer, Employee> map){
        int answer = map.get(id).importance;
        for(int i=0; i<map.get(id).subordinates.size(); i++){
            answer += dfs(map.get(id).subordinates.get(i), map);
        }
        return answer;
    }
}