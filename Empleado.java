public class Empleado {
    private long id;
    private String email;
    public Profile profile;
    public Enum_RolName {Admin, Operario};
    public Enterprise enterprise;
    public Transaction[] transactions;
    private date updatedAT, createdAT;

    public Empleado(long id, String email, Profile profile, Enum_RolName role, Enterprise enterprise, Transaction[] transactions, date updatedAT, date createdAT) {
        this.id = id;
        this.email = email;
        this.profile = profile;
        this.role = role;
        this.enterprise = enterprise;
        this.transactions = transactions;
        this.updatedAT = updatedAT;
        this.createdAT = createdAT;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Enum_RolName getRole() {
        return role;
    }

    public void setRole(Enum_RolName role) {
        this.role = role;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public date getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(date updatedAT) {
        this.updatedAT = updatedAT;
    }

    public date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(date createdAT) {
        this.createdAT = createdAT;
    }
}
