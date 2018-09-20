class Relation {
	private Integer IDB;
	private Integer IDA;

	Relation(Integer IDB, Integer IDA) {
		this.IDB = IDB;
		this.IDA = IDA;
		BooksAuthors.addRelation(this);
	}
	
	public Integer getIDB() {
		return IDB;
	}
	
	public Integer getIDA() {
		return IDA;
	}
}