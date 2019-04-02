<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;

class CreateProductoTable extends Migration {

	public function up()
	{
		Schema::create('producto', function(Blueprint $table) {
			$table->string('cod', 12)->primary();
			$table->string('nombre', 200)->nullable();
			$table->string('nombre_corto', 50)->unique();
			$table->text('descripcion')->nullable();
			$table->decimal('PVP', 10,2);
			$table->string('familia', 6);
		});
	}

	public function down()
	{
		Schema::drop('producto');
	}
}