 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateFile {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contentMap = new HashMap<>();

        for (String path : paths) {
            String[] parts = path.split(" ");
            String directory = parts[0];
            for (int i = 1; i < parts.length; i++) {
                int startIdx = parts[i].indexOf('(');
                int endIdx = parts[i].indexOf(')');
                String fileName = parts[i].substring(0, startIdx);
                String content = parts[i].substring(startIdx + 1, endIdx);
                String fullPath = directory + "/" + fileName;

                contentMap.computeIfAbsent(content, k -> new ArrayList<>()).add(fullPath);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> fileList : contentMap.values()) {
            if (fileList.size() > 1) {
                result.add(fileList);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        DuplicateFile solution = new DuplicateFile();

        // Example 1
        String[] paths1 = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<List<String>> result1 = solution.findDuplicate(paths1);
        System.out.println("Example 1: " + result1);

        // Example 2
        String[] paths2 = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)"};
        List<List<String>> result2 = solution.findDuplicate(paths2);
        System.out.println("Example 2: " + result2);
    }
}

    

