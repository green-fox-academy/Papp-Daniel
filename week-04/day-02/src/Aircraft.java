public class Aircraft {
    String type;
    int maxAmmo;
    int damage;
    int ammoLeft;

    public int fight() {
        int damage = maxAmmo * this.damage;
        this.ammoLeft = 0;
        return damage;
    }

    public int refill(int ammoToRefill) {
        if (ammoToRefill < (this.maxAmmo - this.ammoLeft)) {
            this.ammoLeft += ammoToRefill;
            return 0;
        } else {
            int remain = ammoToRefill - (this.maxAmmo - this.ammoLeft);
            this.ammoLeft = this.maxAmmo;
            return remain;
        }
    }

    public String getType() {
        return this.type;
    }

    public String getStatus() {
        String status = "Type " + this.type + "," + "Ammo: " + this.ammoLeft + "," + "Base Damage: " + this.damage + "," + "All Damage: " + this.ammoLeft * this.damage;
        return status;
    }

    public boolean isPriority() {
        if (type == "F35") {
            return true;
        } else {
            return false;
        }
    }
}
