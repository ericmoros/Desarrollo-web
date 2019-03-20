{!! Form::open(array('route' => 'route.name', 'method' => 'POST')) !!}
	<ul>
		<li>
			{!! Form::label('cod', 'Cod:') !!}
			{!! Form::text('cod') !!}
		</li>
		<li>
			{!! Form::label('nombre', 'Nombre:') !!}
			{!! Form::text('nombre') !!}
		</li>
		<li>
			{!! Form::label('nombre_corto', 'Nombre_corto:') !!}
			{!! Form::text('nombre_corto') !!}
		</li>
		<li>
			{!! Form::label('descripcion', 'Descripcion:') !!}
			{!! Form::textarea('descripcion') !!}
		</li>
		<li>
			{!! Form::label('PVP', 'PVP:') !!}
			{!! Form::text('PVP') !!}
		</li>
		<li>
			{!! Form::label('familia', 'Familia:') !!}
			{!! Form::text('familia') !!}
		</li>
		<li>
			{!! Form::submit() !!}
		</li>
	</ul>
{!! Form::close() !!}