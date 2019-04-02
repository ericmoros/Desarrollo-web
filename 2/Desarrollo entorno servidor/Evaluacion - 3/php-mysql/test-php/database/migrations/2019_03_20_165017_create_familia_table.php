<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;

class CreateFamiliaTable extends Migration {

	public function up()
	{
		Schema::create('familia', function(Blueprint $table) {
			$table->string('cod', 6)->primary();
			$table->string('nombre', 200);
		});
	}

	public function down()
	{
		Schema::drop('familia');
	}
}