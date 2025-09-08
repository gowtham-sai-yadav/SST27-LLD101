import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email: " + p.getEmail());
        System.out.println("Immutable: no setters available. Creating a modified copy via toBuilder()...");
        UserProfile p2 = p.toBuilder().displayName("Alice").build();
        System.out.println("Original displayName: " + p.getDisplayName());
        System.out.println("Modified copy displayName: " + p2.getDisplayName());
    }
}
